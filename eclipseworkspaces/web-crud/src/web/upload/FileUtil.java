package web.upload;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
public class FileUtil extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String ALLOW_IMAGE_TYPE = "png;gif;jpg;jpeg;bmp";
	//允许接收的图片类型
	public static  void upload(HttpServletRequest req) throws ServletException, IOException {
		//解释和检查请求，请求方式是否是post，请求编码是否是multiport/form-data	
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		//创建工厂对象的目的就是来创建FileItem对象的
		
		try {//FileItem对象：form表单中对表单控件的封装
		FileItemFactory factory = new DiskFileItemFactory();
		DiskFileItemFactory factory1 = new DiskFileItemFactory();
		//设置缓存大小
		factory1.setSizeThreshold(20 * 1024);
		//设置临时目录

		//创建文件上传处理器
		ServletFileUpload upload = new ServletFileUpload(factory);
		//设置单个文件的上传大小
		upload.setFileSizeMax(1024*1024*2);
		//设置一次请求中文件的大小
		upload.setSizeMax(1024*1024*1024);
		/**
		 * 应该考虑到IE6的问题，IE6通过FileItem.getName();会返回一个绝对路径
		 */
			List<FileItem> items = upload.parseRequest(req);
			for (FileItem item : items) {
					String fielName = item.getFieldName();
					if(item.isFormField()) {
						String value = item.getString("UTF-8");
						System.out.println(fielName+"-"+value);
					}else {
					//-------------------------
					//上传文件的拓展名
					String mimeType = req.getServletContext().getMimeType(item.getName());
					String ext = FilenameUtils.getExtension(item.getName());
					String[] allowedImageType = ALLOW_IMAGE_TYPE.split(";");					
					//当前上传的文件格式不符合里面的东西
					if(!Arrays.asList(allowedImageType).contains(ext)) {
						throw new LogicException("亲，请传入正确的图片格式");
					}
					//-------------------------
						
						
						//这样就可以解决浏览器之间的差异
						System.out.println(FilenameUtils.getName(item.getName()));
						/**
						 * 如果上传文件的名称一样的话就会覆盖之前的文件，这个时候使用UUID来完成，UUID很长。不会重复的
						 */ 
						String dir = req.getServletContext().getRealPath("/upload");
//						System.out.println(dir);
						String fileName = UUID.randomUUID().toString()+"."+FilenameUtils.getExtension(item.getName());
						item.write(new File(dir,fileName));
						//是否存储在内存之中
						System.out.println(item.isInMemory());
					}
				
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(LogicException e) {
			throw e;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
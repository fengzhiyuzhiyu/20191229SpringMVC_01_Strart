package xyz.twilightgleam.Controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/testUploadOriginalMethod")
    public String testUploadOriginalMethod(HttpServletRequest request) throws Exception {
        // 使用common upload组件进行上传操作
        String realPath = request.getSession().getServletContext().getRealPath("/upload"); // 获取文件上传后存放路径
        File file = new File(realPath);
        if (!file.exists()){
            file.mkdirs(); // 如果文件夹不存在则创建文件
        }
        // 创建文件项
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
        // 解析request对象,获取文件项
        List<FileItem> fileItems = servletFileUpload.parseRequest(request); // 自动解析所有表单项,所以返回为一个集合
        // 遍历集合，排除普通表单项
        for (FileItem f : fileItems) {
            if (f.isFormField()){
                System.out.println("这是一个普通的表单项");
            }else {
                System.out.println("这是一个文件的表单项");
                // 获取文件名
                String name = f.getName();
                String uuid = UUID.randomUUID().toString().replace("-", ""); // 生成唯一的文件id
                name = uuid + "_" + name;
                // 获取文件路径并上传文件
                f.write(new File(realPath, name));
                // 删除临时文件
                f.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/testUploadSpringMethod")
    public String testUploadSpringMethod(HttpServletRequest request, MultipartFile uploadFile) throws IOException { // 注意此处文件名要与表单的name一样
        // 创建文件目录
        String realPath = request.getSession().getServletContext().getRealPath("/upload"); // 获取文件上传后存放路径
        File file = new File(realPath);
        if (!file.exists()){
            file.mkdirs(); // 如果文件夹不存在则创建文件
        }
        // 获取文件名
        String filename = uploadFile.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        // 上传文件
        uploadFile.transferTo(new File(realPath,filename));
        return "redirect:/index.jsp";
    }
}

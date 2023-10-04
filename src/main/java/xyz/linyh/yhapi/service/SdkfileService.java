package xyz.linyh.yhapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;
import xyz.linyh.yhapi.ducommon.model.entity.Sdkfile;
import xyz.linyh.yhapi.ducommon.model.entity.User;

import java.io.IOException;

/**
* @author lin
* @description 针对表【sdkfile(sdk版本管理表)】的数据库操作Service
* @createDate 2023-10-03 13:51:46
*/
public interface SdkfileService extends IService<Sdkfile> {

    /**
     * 将sdk保存到服务器中和数据库中
     * @param file
     * @param user
     * @return
     */
    Boolean saveSDK(MultipartFile file, User user) throws IOException;

    /**
     * 根据文件名获取sdk
     *
     * @param name
     * @return
     */
    Resource getSdkById(String name);
}

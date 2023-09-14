package xyz.linyh.yhapi.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.linyh.yhapi.ducommon.common.PageRequest;

import java.io.Serializable;

/**
 * 查询请求
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * 接口id
     */
    private Long id;

    /**
     * 接口名称
     */
    private String name;


    /**
     * 请求方法
     */
    private String method;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应信息
     */
    private String responseHeader;

    /**
     * 请求参数
     */
    private String requestParams;


    /**
     * 接口状态 0为可用 1为不可用
     */
    private Integer status;

    /**
     * 接口创建者id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}
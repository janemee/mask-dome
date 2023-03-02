package com.jane.dome;


import com.jane.util.DataMask;
import com.jane.util.DataMaskEnum;
import lombok.Data;

/**
 * create by jzm on 2023/3/02 10:05
 */
@Data
public class BizApkHistory  {


    /**
     * 邮件
     */
    @DataMask(function = DataMaskEnum.EMAIL)
    private Integer email;

    /**
     * 文件名称
     */
    @DataMask(function = DataMaskEnum.USERNAME)
    private String name;

}

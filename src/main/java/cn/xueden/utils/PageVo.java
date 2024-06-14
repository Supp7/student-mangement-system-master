package cn.xueden.utils;

import lombok.Data;

/**功能描述：分页查询参数*/
@Data
public class PageVo {
    /**
     * 页码
     */
    private int pageIndex;

    /**
     * 每页显示条数
     */
    private int pageSize;

}

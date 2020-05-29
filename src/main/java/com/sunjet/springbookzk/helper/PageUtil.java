package com.sunjet.springbookzk.helper;

import com.sunjet.springbookzk.utils.dto.PageParam;
import com.sunjet.springbookzk.utils.dto.PageResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by wfb on 17-7-25.
 * 服务层帮助类
 */
public class PageUtil {


    /**
     * 获取分页排序
     *
     * @param pageParam
     * @return
     */
    public static Sort getSort(PageParam pageParam) {
        //排序
        Sort sort = null;
        if (!StringUtils.isEmpty(pageParam.getOrder()) && "desc".equalsIgnoreCase(pageParam.getOrder())) {
//            sort = new Sort(Sort.Direction.DESC, pageParam.getOrderName());
            sort = Sort.by(Sort.Direction.DESC, pageParam.getOrderName());
        } else {
            sort = Sort.by(Sort.Direction.ASC, pageParam.getOrderName());
        }
        return sort;
    }


    /**
     * 获取分页请求参数
     *
     * @param pageParam
     * @return
     */
    public static PageRequest getPageRequest(PageParam pageParam) {
        return PageRequest.of(pageParam.getPage(), pageParam.getPageSize(), PageUtil.getSort(pageParam));
//        return new PageRequest(pageParam.getPage(), pageParam.getPageSize(), PageUtil.getSort(pageParam));
    }

    /**
     * 获取分页返回数据
     *
     * @param rows      已转换的数据集合(不需要转换可以设置为null)
     * @param pages     分页查询结果
     * @param pageParam 分页参数
     * @return PageResult 返回分页数据
     */
    public static PageResult getPageResult(List rows, Page pages, PageParam pageParam) {
        if (rows == null) {//不需要转换
            rows = pages.getContent();
        }
        PageResult result = new PageResult<>(rows, pages.getTotalElements(), pageParam.getPage(), pageParam.getPageSize());
        return result;
    }
}

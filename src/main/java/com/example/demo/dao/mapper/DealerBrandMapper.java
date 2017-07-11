package com.example.demo.dao.mapper;





import com.example.demo.dao.domain.DealerBrand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DealerBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DealerBrand record);

    int insertSelective(DealerBrand record);

    DealerBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DealerBrand record);

    int updateByPrimaryKey(DealerBrand record);

    List<DealerBrand> queryAllBand();

    @Insert("INSERT INTO dealer_brand(brand, order_id,status) VALUES(#{brand},#{orderId},#{status})")
    public int insertByCode(@Param("brand") String brand, @Param("orderId")  Integer orderId,@Param("status") Integer status);
}
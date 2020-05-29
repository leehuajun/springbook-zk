package com.sunjet.springbookzk.repository;

import com.sunjet.springbookzk.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity,String> {
    @Query("select menu from MenuEntity menu order by menu.seq")
    List<MenuEntity> findAllSortBySeq();

    List<MenuEntity> findAllByParentEquals(MenuEntity menu);

    MenuEntity findOneById(String id);

    @Query("select menu from MenuEntity menu where menu.parent.id = ?1 ")
    List<MenuEntity> findAllByParent(String id);

//    @Query("select menu from MenuEntity  menu where  menu.permission = ?1")
//    List<MenuEntity> findAllByPermission(PermissionEntity permissionEntity);
}

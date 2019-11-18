package dazhi.admin.base.repository;

import dazhi.admin.base.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.LinkedHashMap;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    /**
     * 进行数据库操作, 可以通过自定义HQL来完成符合个性的其他操作
     * 通过@Query注解, 完成了HQL的书写, 其中“:name”与下方的@Param注解中参数保持一致。
     * HQL可使用Hibernate的SQL生成和缓存策略
     * HQL中一些关键字如 SELECT, FROM 和 WHERE等, 是不区分大小写的, 但是一些属性如表名和列名区分大小写
     */
    @Query(value = "SELECT u FROM User u WHERE name=:name")
    User findName(@Param("name") String name);

    /**
     * 使用SQL语句, nativeQuery为true代表使用SQL语言
     * 建议尽可能的使用HQL语句, 以避免数据库关于可移植性的麻烦,  且HQL可使用Hibernate的SQL生成和缓存策略。
     */
    @Query(value = "insert into User value(?,?,?)", nativeQuery = true)
    @Transactional
    @Modifying
    int countUserBy(@Param("id") Integer id, @Param("name") String name,
                    @Param("password") String password);

    /**
     * 根据用户名查询
     */
    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);

    /**
     * 查询全部
     */
    @Query("select t from User t")
    List<User> find();

    /**
     * 删除, 必须加入@Modifying和@Transactional
     */
    @Modifying
    @Transactional
    @Query("delete from User u where u.id=:id")
    int deleteUserById(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query("update User u set u.name = :name where u.id=:id")
    int queryUserById(@Param("id") Integer id, @Param("name") String name);

    /* =========================== 分页查询等 =========================== */
    /**
     * 根据表名, 字段, 参数查询, 拼接sql语句
     * @param  tableName 表名
     * @param filed 字段名
     * @param o 字段参数
     */
//    List<User> findByHql(String tableName, String filed, Object o);

//    Object findObjiectByHql(String tableName, String filed, Object o);

    /**
     * 多个字段的查询
     * @param tableName 表名
     * @param map 将你的字段传入map中
     */
//    List<User> findByMoreFiled(String tableName, LinkedHashMap<String, Object> map);

    /**
     * 多字段查询分页
     * @param tableName 表名
     * @param map 以map存储key,value
     * @param star 第几页
     * @param pageNumber 一个页面的条数
     */
//    List<User> findByMoreFiledPage(String tableName, LinkedHashMap<String, Object> map,
//                                   int star, int pageNumber);

    /**
     * 一个字段的分页
     * @param  tableName 表名
     * @param filed 字段名
     * @param o 字段参数
     * @param start 第几页
     * @param pageNumber 一个页面多少条数据
     */
//    List<User> findPages(String tableName, String filed, Object o, int start, int pageNumber);

    /**
     * 根据传入的map遍历key,value拼接字符串, 以id为条件更新
     * @param tableName 表名
     * @param map 传入参数放入map中
     */
//    Integer updateMoreFiled(String tableName, LinkedHashMap<String, Object> map,
//                            Long id);

    /**
     * 根据条件查询总条数返回object类型
     * @param tableName  表名
     * @param map 传入参数放入map中
     */
//    Object findCount(String tableName, LinkedHashMap<String, Object> map);
}

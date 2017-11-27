笛卡尔积

多表查询

自连接

子查询（嵌套查询）


分页：
1.rownum
  select * from (select ai.*,rownum rn from (select * from emp) a1 where rownum <= 10) where >= 6;

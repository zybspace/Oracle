1.conn 用户名/密码 [as sysdba] // 使用用户连接数据库，亦可切换用户连接数据库，[as sysdba]的意思是使用sysdba这个角色连接数据库，普通用户不需要写。
  但sys用户必须加上as sysdba。
2.show user //显示当前登录的用户。
3.create user 用户名 identified by 密码  //创建新用户，但sys或system才有其权限
4.alter user 用户名 identified by 密码   //修改用户的密码
5.select * from user_sys_privs;    //查看权限
6.desc 表名；  //查看表结构





select * from all_tables where owner='TEST'；  //查看当前用户下有几张表

select * from all_tables where tablespace_name='TRAIN'; //查看某个表空间中有多少张表

select * from all_tables where tablespace_name='TRAIN' and owner='TRAIN';  //查看某个表空间下,某个用户有多少表

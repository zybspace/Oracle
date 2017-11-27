1---sql---DDL   DQL   TCL   DCL   DML       ---复杂报表
2---PL/SQL    存储过程  函数   包  触发器      ---开发
3---体系结构   物理结构   内存结构    网络结构    逻辑结构

1.什么是数据库?
	数据库就是按照一定的方式来组织,管理和存储数据的仓库.
2.数据库的基本概念:
	1)数据库:DataBase(DB)
	2)数据库管理系统:DataBase Management System(DBMS)
	3)数据库管理员:DataBase Administrator(DBA)
  
3.SQL的分类:
	1)DQL:数据库查询语言
			用于查询数据库中的数据
	2)DML:数据库操作语言
			用于增加,修改,删除数据
	3)DDL:数据库定义语言
			用于操作数据库对象.比如表的创建,删除,修改
	4)DCL:数据控制语言
			用于控制用户权限
	5)TCL:事务控制语言
			用于控制事务
      
      
小型数据库：access、foxbase      负载量小： 100人以内
中型数据库：mysql、sql server、informix     负载，日访问量5000~15000
大型数据库：sybase、oracle、db2   性能比较sybase < oracle < db2;  这几个数据库安全性很高，成本也很高

用什么数据库：
  a.负载量多大，用户多大
  b.成本
  c.安全性
  
orcale在安装成功后，会默认生成三个用户
sys用户：超级管理员 权限最高 它的角色 dba 密码 change_on_install
System 用户：是系统管理员  权限也很高  它的角色是 dbaoper  密码是manager
scott用户：普通用户  密码是tiger

sys有create database 的权限，而system没有，其它相似

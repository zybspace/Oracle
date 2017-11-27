介绍SQLPLUS
	1)sqlplus是Oracle提供的一个命令行执行工具
	2)进入sqlplus方式:
		a.直接通过cmd里面输入sqlplus,然后进行用户名以及密码的校验.
		b.直接通过开始栏里面的Oracle里面的命令行工具进入,然后进行用户名以及密码的校验.
  3)简单几个命令:
		a.conn+用户名/密码 : 连接数据库,使用相关用户 scott/tiger
		b.disconn:断开当前用户连接
		c.exit: 跳出sqlplus工具
		d.show user:展示当前登录用户的用户名
		e.select * from tab;展示当前登录用户下的所有表对象
		提示用户锁定,解决方式:
			sqlplus "sys/sys as sysdba";
			//alter user scott identified by xxx;
			alter user scott account unlock;
			disconn;
			conn scott/xxx;
			select * from tab;
      
权限：分为系统权限、 对象权限
系统权限：用户对数据库的相关权限
对象权限：用户对其他用户的数据对象操作的权限（比如表，视图，存储过程）


用户管理
	有关用户的操作都要在DBA权限下进行:
	--conn sys/sys as sysdba;
	--用户的创建
	create user xiaoxiao identified by 123;
	--用户连接的授权:
	grant create session to xiaoxiao;
	grant create view to scott;
	--用户的角色授权:
	grant connect,resource to xiaoxiao;
	--修改用户密码
	alter user xiaoxiao identified by 321;
	--用户的锁定
	alter user xiaoxiao account lock;
	--用户解锁
	alter user xiaoxiao account unlock;
	--用户的删除
	drop user xiaoxiao cascade;
	--授予其他用户表的权限
	grant all on scott.emp to xiaoxiao;
	--收回权限:
	revoke all on scott.emp from xiaoxiao;
	--查看权限
	select * from user_sys_privs;


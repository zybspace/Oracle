1)创建一张表:
  create table myuser(
    id number,
    name varchar2(32),
    sex char(3),
    age number(3)
  );
2)复制一张表:
  create table 表名 as 子查询;
  --复制表结构和数据
  create table emp_bak as(select * from emp);
  --复制表结构和不要数据
  create table emp_bak as(select * from emp where 1=0);
  --复制部分表结构和数据
  create table emp_bak as(select ename,empno from emp);
  --复制部分表结构和不要数据
  create table emp_bak as(select ename,empno from emp where 1=0); 

3)insert into 插入
  a. insert into 表名(字段名+) values(值+)
  insert into myuser(id,name) values(1,'tom');
  b. insert into 表名 values(...);
  insert into myuser values(2,'jack','男',12);
  --批量插入数据
  insert into emp_bak (select * from emp);
  insert into myuser(id,name) (select empno,ename from emp);
4)update 修改
  语法:update 表名 set 字段名=新值,字段名=新值 where..
  update emp_bak set sal=2000,comm=1000 where empno=7934;
5)delete 删除
  delete [from] 表名 where ...
  delete from emp_bak where deptno = 10;
  
转换函数
		1)日期转换字符串
			to_char(date,mode):
			将date以指定格式(mode)转化成字符串
			select to_char(sysdate,'yyyy-MM-dd') from dual;
			select to_char(sysdate,'yyyy"年"MM"月"dd"日"') from dual;
			select to_char(sysdate,'yyyy-MM-dd hh24:mi:ss') from dual;
		2)字符串转换成日期
			to_date(string,mode):
			将以指定格式(mode)string转化成日期
			select to_date('2014-05-01','yyyy-MM-dd') from dual;
			select last_day(to_date('2014-05-01 14:11:22','yyyy-MM-dd hh24:mi:ss')) from dual;
		3)字符串转数字
			to_nubmer(string)
			select to_number('123')+123 from dual;
      
      
      
savepoint aa；设置保存点
rollback aa;回滚到保存点

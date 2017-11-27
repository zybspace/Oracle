create table student(
  xh number(4),
  xm varchar2(20),
  sex char(2),
  birthday data,
  sal number(7,2)
);

create table classes(
  classId number(),
  
)

添加一个字段：
    语法:alter table 表名 add(字段名 类型,...)
    alter table student add (classId number(2));

修改字段长度
    alter table student modify (xm varchar2(30));

列的类型修改（不能有数据）
    注意:修改列的类型如果有数据的话,不能违背原数据类型以及长度原则.
        比如:一个varchar2类型的字段,不能改成number类型
        一个varchar2类型的字段长度为20,不能修改成20以下.
    语法:alter table 表名 modify(需要修改的列名 类型..)
    alter table student modify (xm char(30));

修改列的名称
    语法:alter table 表名 rename column 原字段名 to 新字段名
		alter table student rename column sal to salary;

删除列
		语法:alter table 表名 drop column 字段名;
		alter table myuser drop column age;

表名修改
		rename 原表名 to 新表名
		rename myuser to myusers;


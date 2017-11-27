1.分组函数只能出现在选择列表、having、order by中
2.分组的顺序 group by, having, order by
3.选择列中如果有列、表达式、和分组函数，那么这些列和表达式必须有一个出现在group by字句中，否则会出错

DQL数据库查询语言
	1)查询语句
		select 列名,列名... from 表名;
		select * from 表名;
	2)别名
		列名 [as] 自定义名称
	3)数字运算
		包括:+ - * /
		注意:
			a.空值跟任意数据做运算结果都为空
			b.数字运算只能作用在数字列,不能使用在非数字类型的字段.
	4)nvl函数:
		格式:nvl(p1,p2):如果p1为空,则显示p2,否则,显示p1
	例:查找emp表中所有人的姓名以及月收入
		select ename,sal+nvl(comm,0) from emp;
	5)列名拼接:
		select ename||','||job from emp;
	6)去重复值:distinct
		例:查找emp表中存在的部门编号
		select distinct deptno from emp;
	7)带条件查询: where
		select ename,deptno from emp where deptno=10;
		--条件语句:
		a.比较操作符:<,>,<=,>=,!=,<>,=
		在Oracle中,字符串使用单引号引起来,并且所有的数据是区分大小写,字段名,表名不分.
		b.逻辑操作符:and ,between .. and .. ,or,in(),not in(),is not null,is null,like
		例:查找emp表中工资在1000~3000之间的所有人员信息
		select empno,ename,sal from emp where sal >=1000 and sal <=3000;
		select empno,ename,sal from emp where sal between 1000 and 3000;
		例:查找emp表中工资是1100或1600的所有人员信息
		select empno,ename,sal from emp where sal = 1100 or sal = 1600;
		select empno,ename,sal from emp where sal in (1100,1600);
		例:找到没有奖金的人员信息
		select empno,ename,comm from emp where comm is null or comm = 0;
		c.like 模糊查询
		通配符: 匹配一个字符: _ 匹配多个字符:%
		例:查找emp表中姓名第二个字母为L的人员信息
		select empno,ename,job from emp where ename like '_L%';
	8)排序
		order by 需要排序的列名 asc(升序)|desc(降序)
	例:查找emp表中sal大于1000的人员信息并且按照工资降序,在按照奖金升序.
	select empno,ename,sal,comm from emp where sal>1000 order by sal desc,comm asc;

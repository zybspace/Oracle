1.group by 和 having子句
    group by 用于对查询结果的分组统计
    having 用于限制显示分组显示结果 
    
    
1.分组函数只能出现在选择列表、having、order by中
2.分组的顺序 group by, having, order by
3.选择列中如果有列、表达式、和分组函数，那么这些列和表达式必须有一个出现在group by字句中，否则会出错    

max(),min(),avg(),nvl(p1,p2)

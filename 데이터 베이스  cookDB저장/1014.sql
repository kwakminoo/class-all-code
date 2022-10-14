select uName,
	sum(case when season='봄' then amount end) as '봄',
    sum(case when season='여름' then amount end) as '여름',
    sum(case when season='가을' then amount end) as '가을',
    sum(case when season='겨울' then amount end) as '겨울'
from pivottest
group by uName;
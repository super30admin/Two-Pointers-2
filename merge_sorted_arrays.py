








create database databasename


Renaming:

alter Sample1 modify name=Sample3
sp_renameDB 'Sample1','Sample2'


drop database Sample4


Use [Sample]
Go


Create table tblGender
(
ID int NOT NULL Primary Key,
Gender nvarchar(50) NOT NULL
)

ID,name, email,GenderID in tblPerson 


Alter table tblPerson add constraint tblPerson_GenderID_FK
Foreign KEY (GenderID) references tblGender(ID)


select from tbPerson where email LIKE '_@_'


select e.name,e.gender,e.salary,d.departmentName from tbleEmployee e

INNER JOIN tblDepartment d ON e.departmentID=d.ID


NON MATCHING ROWS ::
select name,gender,salary,departmentName
from tbleEmployee LEFT JOIN tblDepartment
ON tblEmployee.DepartmentID=tblDepartment.ID
WHERE tbleDepartment.ID IS NULL




SELF JOIN :

EmployeeID,Name,ManagerID                   Employee,ManagerID


select e.Name as Employee, m.Name as Manager from 
tblEmployees e LEFT JOIN tblEmployees m
ON e.ManagerID=m.EmployeeID


REPLACING NULL VALUES:
1))ISNULL()
2)CASE
3) COALESCE()

ISNULL:
select E.Name as Employee, ISNULL(M.Name,'No Manager') as Manager
from 
Employees e left join Employees m
ON e.ManagerID = m.EmployeeID



CASE::
CASE WHEN Expression THEN '' ELSE '' END


CREATE PROC sp_Procedurename
@Gender nvarchar(20)
@DepartmentID int
AS
BEGIN

select name, Gender,DepartmentID from tbleEmployee where Gender=@Gender
END
exec sp_Procedurename M,110



STRING FUNCTIONS:
ASCII - to return ascii code

ASCII(str) = but gives only of first value
CHAR(int) - converts ASCII code to character , int between 0 adn 255
LTRIM
RTRIM
LOWER
UPPER()
LOWER()
LEFT(character_ex,int) = left hand side - like first 3 chars from left hand side if string
select LEFT('ABCDE',3) from tbEmployees

RIGHT(",")

CHARINDEX(expression to find,expression to search,start_location)
substring('expression','start','length') 

Select charindex('@','sara@aaa.com')
select substring('sara@aaa.com',charindex('@','pam@bbb.com'),7)






FOR A-Z     
@Declare @Start int
Set @Start = 65
While (@Start <=90)
Begin 
	Select char(@Start)
	Set @Start = @Start+1
END
 







CTE:
With EmployeeCount(deptName,ID,totalEmps)
AS
(
Query.....
)
select deptname, totalEmps from EmployeeCount
where TotalEmps>2 Guan 













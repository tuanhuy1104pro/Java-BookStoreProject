use master
Create database DbBookStore

use DbBookStore

create table Category
(
	CategoryId int primary key,
	CategoryName nvarchar(42)
)
select * from Category where CategoryName = N'Lịch sử';
create table Book
(
	BookId varchar(37) primary key,
	CategoryId int foreign key references Category(CategoryId),
	BookName nvarchar(50),
	Price int,
	GioiThieu text
)
--select BookId,BookName,CategoryName,Price,GioiThieu from Book,Category where Book.CategoryId = Category.CategoryId
--select BookId,BookName,CategoryName,Price,GioiThieu from Book,Category where Book.CategoryId = Category.CategoryId and (Book.BookId = 'Lịch sử' or Book.BookName = 'Lịch sử' or Category.CategoryName =N'Lịch sử')
select Book.BookId,BookName,CategoryName,Price,Book.GioiThieu, Name as TacGia,TonKho from Book,Category,BookDetail,Author where Book.CategoryId = Category.CategoryId and Book.BookId = BookDetail.BookId and BookDetail.AuthorId = Author.AuthorId and Book.TonKho > 0

update  Book
set TonKho = 0 where BookId = ''

alter table Book
add TonKho int null;

select Book.BookId,BookName,CategoryName,Price,Book.GioiThieu,Author.AuthorId, Name as TacGia,TonKho from Book,Category,BookDetail,Author where Book.CategoryId = Category.CategoryId and Book.BookId = BookDetail.BookId and BookDetail.AuthorId = Author.AuthorId

--insert into Book values('',1,N'',1,'')
create table Author
(
	AuthorId varchar(37) primary key,
	Name nvarchar(42),
	DateOfBirth varchar(15),
	GioiThieu text
)
select * from Author where Name = N'Huy';
create table BookDetail
(
	BookId varchar(37) foreign key references Book(BookId),
	AuthorId varchar(37) foreign key references Author(AuthorId)
)
select * from Book,Author,BookDetail
where Book.BookId = BookDetail.BookId and Author.AuthorId = BookDetail.AuthorId and Author.Name = N'Huy'
Go
create table Users
(
	UserId varchar(37) primary key,
	UserName varchar(37),
	UserPass Nvarchar(37),
	FullName nvarchar(42),
	UserAddress nvarchar(42),
	PhoneNumber varchar(15),
	UserRole nvarchar(32)
)
Create table Coupon
(
	CouponId varchar(37) primary key,
	CouponName nvarchar(50),
	Discount float
)

--Select * from Coupon;

Create table HoaDon
(
	IdHoaDon varchar(37) primary key,
	UserId varchar(37) foreign key references Users(UserId),
	TongTien Bigint,
	NgayXuat DateTime,
	CouponId varchar(37) foreign key references Coupon(CouponId)
)

create table ChiTietHoaDon
(
	IdHoaDon varchar(37) foreign key references HoaDon(IdHoaDon),
	BookId varchar(37) foreign key references Book(BookId),
	SoLuong int
)

Insert into Category values(1,N'Lịch sử'),
(2,N'Trinh thám'),
(3,N'Tình Cảm'),
(4,N'Giáo Dục'),
(5,N'Tiểu Thuyết')
--

Insert into Users values('U01','teominh@gmail.com','teo123','Nguyen Minh Teo','Ho Chi Minh','093212341234','User'),
('U02','teominh2@gmail.com','teo123','Nguyen Minh Teo 2','Ho Chi Minh 2','093212341235','Admin')

--insert into Users(UserId,UserName,UserPass,UserRole) values('','','','');

--
select Count(UserId) as CountById from Users;

update Users
set FullName = '',UserAddress = '',PhoneNumber = ''
where UserName = '' and UserPass ='';
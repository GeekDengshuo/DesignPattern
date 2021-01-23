### Iterator

迭代器，也叫游标(cursor)，对象行为型模式 

Wikipedia says

> In object-oriented programming, the iterator pattern is a design pattern in which an iterator is 
> used to traverse a container and access the container's elements.

#### Intent

提供一个方法访问聚合对象中的元素，而不需要暴露聚合对象的内部表示

#### Pros

支持不同的方式遍历一个聚合

简化了聚合的接口

在同一个聚合上有多个遍历

#### Cons

增加了类的个数，增加了系统的复杂性

#### Example


浏览最近所拍风景照片

#### Tips

外部迭代器 external iterator : 当客户来控制迭代

内部迭代器 internal iterator : 迭代器控制迭代


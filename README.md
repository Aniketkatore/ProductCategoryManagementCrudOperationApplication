# ProductCategoryManagementCrudOperationApplication

developed ProductCategoryManagementCrudOperationApplication
Using Following technologies
A) Use Spring boot
B) Use Rest controller
C)MYSQL DB configuration 
D) Used annotation based configuration 
E) JPA & Hibernate
 
1) Category CRUD operation.
 
Below are the APIs are developed :
 
1	http://localhost:8080/api/categories
GET all the categories
2	http://localhost:8080/api/categories
POST - create a new category
3	http://localhost:8080/api/categories/{id}
GET category by Id
4	http://localhost:8080/api/categories/{id}
PUT - update category by id
5	http://localhost:8080/api/categories/{id}
DELETE - Delete category by id
 
 
2) Product CRUD operation.
 
Below are the APIs are developed :
 
1	http://localhost:8080/api/products
GET all the products
2	http://localhost:8080/api/products
POST - create a new product
3	http://localhost:8080/api/products/{id}
GET product by Id
4	http://localhost:8080/api/products/{id}
PUT - update product by id
5	http://localhost:8080/api/products/{id}
DELETE - Delete product by id
 
 
3) Relation between Category-Products should have one-to-many relation. (One category can have multiple products).
5) While fetching single product details the response should be populated with respective category details.

thats all..



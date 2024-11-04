<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hibernate JPA Relationships Example</title>
</head>
<body>

<h1>Hibernate JPA Relationships Example</h1>

<p>This project demonstrates the use of JPA and Hibernate for establishing and managing various types of entity relationships in a Java application. The relationships covered include:</p>

<ul>
    <li><strong>One-to-One</strong> between <code>Student</code> and <code>Laptop</code></li>
    <li><strong>One-to-Many</strong> between <code>DepartmentOfEmp</code> and <code>Employee</code></li>
    <li><strong>Many-to-Many</strong> between <code>Question</code> and <code>Answer</code></li>
</ul>

<h2>Project Structure</h2>

<pre>
src
├── com
│   ├── entity
│   │   ├── DepartmentOfEmp.java
│   │   ├── Employee.java
│   │   ├── Laptop.java
│   │   └── Student.java
│   │
│   ├── main
│   │   ├── Main_Class.java
│   │   └── MappingMain.java
│
├── paper
│   ├── entity
│   │   ├── Answer.java
│   │   └── Question.java
│   │
│   └── main
│       └── StoreData.java
│
└── resources
    └── hibernate.cfg.xml
</pre>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<p>Ensure you have the following installed:</p>

<ul>
    <li>Java Development Kit (JDK) 8 or higher</li>
    <li>Apache Maven</li>
    <li>MySQL or another compatible database</li>
</ul>

<h3>Setup</h3>

<ol>
    <li><strong>Database Configuration</strong>: Update your <code>hibernate.cfg.xml</code> file to configure your database connection. Replace the placeholders with your database credentials:</li>
</ol>

<pre>
&lt;property name="hibernate.connection.url"&gt;jdbc:mysql://localhost:3306/your_database&lt;/property&gt;
&lt;property name="hibernate.connection.username"&gt;your_username&lt;/property&gt;
&lt;property name="hibernate.connection.password"&gt;your_password&lt;/property&gt;
</pre>

<ol start="2">
    <li><strong>Dependencies</strong>: This project uses Hibernate 6 and JPA annotations. To install the necessary dependencies, run:</li>
</ol>

<pre>
mvn install
</pre>

<h3>Running the Project</h3>

<ol>
    <li><strong>Compile the project</strong>: </li>
</ol>

<pre>
mvn compile
</pre>

<ol start="2">
    <li><strong>Run the main classes</strong>:</li>
</ol>

<ul>
    <li><strong>One-to-One Mapping</strong>: Run <code>MappingMain</code> for <code>Student</code> and <code>Laptop</code>.</li>
    <li><strong>One-to-Many Mapping</strong>: Run <code>Main_Class</code> for <code>DepartmentOfEmp</code> and <code>Employee</code>.</li>
    <li><strong>Many-to-Many Mapping</strong>: Run <code>StoreData</code> for <code>Question</code> and <code>Answer</code>.</li>
</ul>

<p>Each class demonstrates the relationship type specified in the code and will log messages indicating successful data persistence.</p>

<h3>Entity Relationship Summary</h3>

<ul>
    <li><strong>One-to-One Mapping</strong> (<code>Student</code> - <code>Laptop</code>): Each student has one laptop.</li>
    <li><strong>One-to-Many Mapping</strong> (<code>DepartmentOfEmp</code> - <code>Employee</code>): Each department has multiple employees.</li>
    <li><strong>Many-to-Many Mapping</strong> (<code>Question</code> - <code>Answer</code>): Each question can have multiple answers, and each answer can belong to multiple questions.</li>
</ul>

<h2>Author</h2>
<p>This project is a demonstration of various entity mappings using Hibernate and JPA annotations.</p>

</body>
</html>

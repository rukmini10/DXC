<%-- main file for creating new account --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
<meta charset="ISO-8859-1">
<title>Account Management</title>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:wght@700&family=Poppins:wght@400;500;600&display=swap');
*{
  margin:0;
  padding: 0;
  
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
body{
  margin: 10px;
  padding: 0;
background: linear-gradient(#ff6e7f, #bfe9ff);
 height: 150vh;
 
  
}
.center{
  position: absolute;
  top: 70%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 400px;
  background: white;
  border-radius: 10px;
  box-shadow: 10px 10px 15px rgba(0,0,0,0.05);
}
.center h1{
  text-align: center;
  padding: 20px 0;
  border-bottom: 1px solid silver;
}
.center form{
  padding: 0 40px;
  box-sizing: border-box;
}
form .txt_field{
  position: relative;
  border-bottom: 2px solid #adadad;
  margin: 30px 0;
}
.txt_field input{
  width: 100%;
  padding: 0 5px;
  height: 30px;
  font-size: 16px;
  border: none;
  background: none;
  outline: none;
}
.txt_field label{
  position: absolute;
  top: 50%;
  left: 5px;
  color: #adadad;
  transform: translateY(-50%);
  font-size: 16px;
  pointer-events: none;
  transition: .5s;
}
.txt_field span::before{
  content: '';
  position: absolute;
  top: 30px;
  left: 0;
  width: 0%;
  height: 2px;
  background: #2691d9;
  transition: .5s;
}
.txt_field input:focus ~ label,
.txt_field input:valid ~ label{
  top: -5px;
  color: #2691d9;
}
.txt_field input:focus ~ span::before,
.txt_field input:valid ~ span::before{
  width: 100%;
}
.pass{
  margin: -5px 0 20px 5px;
  color: #a6a6a6;
  cursor: pointer;
}
.pass:hover{
  text-decoration: underline;
}
input[type="submit"]{
  width: 100%;
  height: 50px;
  border: 1px solid;
  background: #2691d9;
  border-radius: 25px;
  font-size: 18px;
  color: #e9f4fb;
  font-weight: 700;
  cursor: pointer;
  outline: none;
}
input[type="submit"]:hover{
  border-color: #2691d9;
  transition: .5s;
}

 
 
 </style>
</head>
<body>
	<div class="center">
		<h1>Account Register Form</h1>
		<form action="Register" method="post">
		<div class="txt_field">
          <input type="text" name="UserName" required/>
          <span></span>
          <label for="UserName">User Name</label>
        </div>
        <div class="txt_field">
          <input type="text" name="Full_Name" required/>
          <span></span>
          <label for="Full_Name">Full Name</label>
        </div>
        <div class="txt_field">
          <input type="email" name="Email" required>
          <span></span>
          <label for="Email">Email Id</label>
        </div>
        <div class="txt_field">
          <input type="number" name="Phone_Number" required>
          <span></span>
          <label for="Phone_Number">Mobile Number</label>
        </div>
        <div class="txt_field">
          <input type="text" name="Address" required>
          <span></span>
          <label for="Address">Address</label>
        </div>
        <div class="txt_field">
          <input type="text" name="Pancard_Number" required>
          <span></span>
          <label for="Pancard_Number">Pancard Number</label>
        </div>
         <div class="txt_field">
          <input type="text" name="Security_Question" required>
          <span></span>
          <label for="Security_Question">Security_Question(Hobbies)</label>
        </div>
         <div class="txt_field">
          <input type="text" name="Balance" required>
          <span></span>
          <label for="Balance">Balance Amount</label>
        </div>
         <div class="txt_field">
          <input type="text" name="Account_Type" required>
          <span></span>
          <label for="Account_Type"> Type Of Account</label>
        </div>
         <div class="txt_field">
          <input type="date" name="Opening_Date" required>
          <span></span>
          <label for="Opening_Date"> Date Of Opening</label>
        </div>
         <div class="txt_field">
          <input type="password" name="Account_Password" required>
          <span></span>
          <label for="Account_Password"> Account Password</label>
        </div>
				
			<input type="submit" value="Register" /><br><br>
		</form>
	</div>
</body>
</html>
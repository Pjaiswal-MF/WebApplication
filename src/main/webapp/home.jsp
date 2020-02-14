<%@ page import="java.util.ArrayList" %>
<%@ page import="pojo.InsertToDB" %>

<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Lato&display=swap" rel="stylesheet">
    <style>

        .card{
            border: 2px black solid;
            border-radius: 5px;
            padding: 10px;
            width: fit-content;
            font-family: 'Lato', sans-serif;
            color: black;
            background-color: lightblue;
            text-decoration: none;
        }


    </style>
</head>
</head>

<body>
<%

    ArrayList<InsertToDB> userArrayList = (ArrayList<InsertToDB>) session.getAttribute("userArrayList");

%>

<% for (InsertToDB user:
        userArrayList) {
    %>
<div class="card">
    <strong> Client User ID : <%=user.getClientUserIdStr()%></><br>
    <strong> Invite Code : <%=user.getInviteCode()%></><br>
    <strong> Status : <%=user.getStatus()%></><br>
    <strong> User Id : <%=user.getUserId()%></><br>
    <strong> Invite Code URL : <a href="<%=user.getInviteUrl()%>"><%=user.getInviteUrl()%></a></strong><br>
</div>
<br>
<%
    }
%>
</body>
</html>

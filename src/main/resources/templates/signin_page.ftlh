<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <title>Login</title>

    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #d0f0c0; /* Lighter green background */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 80%;
            max-width: 300px;
        }

        h1 {
            color: #2d8a57; /* Dark green */
            text-align: center;
            margin-bottom: 20px;
        }

        form {
            display: grid;
            gap: 20px;
        }

        label {
            display: block;
            color: #555;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #2d8a57; /* Dark green */
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #247a4f; /* Darker green */
        }
    </style>

</head>
<body>

<div class="container">
    <h1>SignIn</h1>

    <form action="/login" method="post">
        <label for="username">Username</label>
        <input name="username" id="username" type="text" placeholder="USERNAME" required>

        <label for="password">Password</label>
        <input name="password" id="password" type="password" placeholder="PASSWORD" required>

        <input type="submit" value="LOGIN">
    </form>
</div>

</body>
</html>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <title>Calculator page</title>

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
            max-width: 400px;
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

        input[type="text"] {
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

        hr {
            margin: 20px 0;
            border: none;
            border-top: 1px solid #ccc;
        }

        h2 {
            color: #2d8a57; /* Dark green */
            margin-top: 20px;
        }

        p {
            color: #333;
            margin-bottom: 20px;
        }
    </style>

</head>
<body>

<div class="container">
    <h1>Calculator</h1>

    <form action="/calculate" method="post">

        <label for="firstNumber">Value 1</label>
        <input name="firstNumber" id="firstNumber" type="text" required>

        <label for="operator">Operator</label>
        <input name="operator" id="operator" type="text" required>

        <label for="secondNumber">Value 2</label>
        <input name="secondNumber" id="secondNumber" type="text" required>

        <input type="submit" value="Calculate">
    </form>

    <hr>

    <#if result??>
        <h2>The Result</h2>
        <p>The result of the calculation is: ${result}</p>
    </#if>
</div>

</body>
</html>

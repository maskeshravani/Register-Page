# Register-Page

Frontend: An HTML form with CSS for user-friendly input collection.

Fields: First Name, Last Name, Email, Password.
Form submits data via POST to the regForm servlet.
Backend: A servlet (RegisterSer) processes the form data:

Collects form inputs using HttpServletRequest.
Inserts the data into a MySQL database (batch197 → register table).
Database Integration:

Uses JDBC to connect and perform an INSERT operation.
Requires the com.mysql.cj.jdbc.Driver for MySQL.
Styling: The form is styled with a pink background, centered layout, and a clean, modern design.

Improvements:
Add input validation.
Handle exceptions with proper error messages.
Implement password encryption for security.






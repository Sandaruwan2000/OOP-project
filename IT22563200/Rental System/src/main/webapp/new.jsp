<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Search Box in Modal</title>
</head>
<body>
    <h1>Click the button to open a search box in a modal.</h1>

    <!-- Add a button to open the modal -->
    <button onclick="openSearchBox()">Open Search Box</button>

    <!-- The modal -->
    <div id="searchModal" style="display: none; position: fixed; z-index: 1; left: 0; top: 0; width: 100%; height: 100%; background-color: rgba(0, 0, 0, 0.7); display: flex; justify-content: center; align-items: center;">
        <div style="background-color: #fff; padding: 20px; border: 1px solid #ccc; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);">
            <span onclick="closeSearchBox()" style="float: right; cursor: pointer;">&times;</span>
            <h2>Search Box</h2>
            <iframe id="searchFrame" src="search.jsp" frameborder="0" width="100%" height="500"></iframe>
        </div>
    </div>

    <script>
        var searchModal = document.getElementById("searchModal");
        var searchFrame = document.getElementById("searchFrame");

        function openSearchBox() {
            searchModal.style.display = "block";
        }

        function closeSearchBox() {
            searchModal.style.display = "none";
        }

        // Function to handle the search result and redirect
        function performSearch() {
            var searchTerm = searchFrame.contentWindow.document.getElementById("searchInput").value;
            alert("You searched for: " + searchTerm);
            closeSearchBox();
            
            // Redirect to another page
            window.location.href = "newpage.jsp"; // Replace "newpage.jsp" with your desired page
        }
    </script>
</body>
</html>

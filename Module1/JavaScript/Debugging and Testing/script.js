const form = document.getElementById("registerForm");
const message = document.getElementById("responseMessage");

form.addEventListener("submit", function (e) {
  e.preventDefault();
  console.log("Form submission triggered");

  message.textContent = "Submitting...";
  message.className = "message";

  const { name, email, event: eventField } = form.elements;

  const userData = {
    name: name.value.trim(),
    email: email.value.trim(),
    event: eventField.value
  };

  console.log("Collected userData:", userData);

  // Debugging: Add a breakpoint here in DevTools
  setTimeout(() => {
    console.log("Sending POST request to API...");

    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(userData)
    })
      .then(response => {
        console.log("Fetch response status:", response.status);
        if (!response.ok) {
          throw new Error("Network response was not OK");
        }
        return response.json();
      })
      .then(data => {
        console.log("Server response data:", data);
        message.textContent = `Successfully registered ${userData.name} for "${userData.event}"!`;
        message.classList.add("success");
        form.reset();
      })
      .catch(error => {
        console.error("Registration failed:", error);
        message.textContent = "Registration failed. Please try again.";
        message.classList.add("error");
      });
  }, 2000);
});

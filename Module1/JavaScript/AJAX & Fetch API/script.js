const form = document.getElementById("registerForm");
const message = document.getElementById("responseMessage");

form.addEventListener("submit", function (e) {
  e.preventDefault();
  message.textContent = "Submitting...";
  message.className = "message";

  const { name, email, event: eventField } = form.elements;

  const userData = {
    name: name.value.trim(),
    email: email.value.trim(),
    event: eventField.value
  };

  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(userData)
    })
      .then(response => {
        if (!response.ok) {
          throw new Error("Network response was not OK");
        }
        return response.json();
      })
      .then(data => {
        message.textContent = `Successfully registered ${userData.name} for "${userData.event}"!`;
        message.classList.add("success");
        form.reset();
      })
      .catch(error => {
        message.textContent = "Registration failed. Please try again.";
        message.classList.add("error");
      });
  }, 2000);
});

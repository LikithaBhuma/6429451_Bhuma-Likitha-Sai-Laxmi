const form = document.getElementById("registrationForm");
const confirmation = document.getElementById("confirmation");

form.addEventListener("submit", function (event) {
  event.preventDefault();

  const { name, email, event: selectedEvent } = form.elements;

  const nameVal = name.value.trim();
  const emailVal = email.value.trim();
  const eventVal = selectedEvent.value;

  let hasError = false;

  document.getElementById("nameError").textContent = "";
  document.getElementById("emailError").textContent = "";
  document.getElementById("eventError").textContent = "";
  confirmation.textContent = "";

  if (nameVal === "") {
    document.getElementById("nameError").textContent = "Name is required.";
    hasError = true;
  }

  if (emailVal === "") {
    document.getElementById("emailError").textContent = "Email is required.";
    hasError = true;
  } else if (!/^\S+@\S+\.\S+$/.test(emailVal)) {
    document.getElementById("emailError").textContent = "Invalid email format.";
    hasError = true;
  }

  if (eventVal === "") {
    document.getElementById("eventError").textContent = "Please select an event.";
    hasError = true;
  }

  if (!hasError) {
    confirmation.textContent = `Successfully registered ${nameVal} for "${eventVal}".`;
    form.reset();
  }
});

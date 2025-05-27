class Event {
  constructor(name, date, seats, category) {
    this.name = name;
    this.date = date;
    this.seats = seats;
    this.category = category;
  }

  register() {
    if (this.seats > 0) {
      this.seats--;
      return true;
    }
    return false;
  }

  cancel() {
    this.seats++;
  }
}

let communityEvents = [];

const container = document.querySelector("#eventContainer");
const spinner = document.querySelector("#spinner");

function renderEvents(events) {
  container.innerHTML = "";
  events.forEach((event, index) => {
    const card = document.createElement("div");
    card.className = "card";

    const title = document.createElement("h3");
    title.textContent = event.name;

    const details = document.createElement("p");
    details.textContent = `${event.date} | ${event.category}`;

    const seats = document.createElement("p");
    seats.textContent = `Seats left: ${event.seats}`;

    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.onclick = () => {
      if (event.register()) {
        renderEvents(communityEvents);
      } else {
        alert("No seats available!");
      }
    };

    const cancelBtn = document.createElement("button");
    cancelBtn.textContent = "Cancel";
    cancelBtn.onclick = () => {
      event.cancel();
      renderEvents(communityEvents);
    };

    card.appendChild(title);
    card.appendChild(details);
    card.appendChild(seats);
    card.appendChild(registerBtn);
    card.appendChild(cancelBtn);

    container.appendChild(card);
  });
}
function fetchEventsWithThen() {
  spinner.style.display = "block";
  fetch("events.json")
    .then(response => response.json())
    .then(data => {
      communityEvents = data.map(ev => new Event(ev.name, ev.date, ev.seats, ev.category));
      renderEvents(communityEvents);
      spinner.style.display = "none";
    })
    .catch(error => {
      spinner.textContent = "Failed to load events.";
      console.error("Error loading events:", error);
    });
}
async function fetchEventsAsync() {
  spinner.style.display = "block";
  try {
    const response = await fetch("events.json");
    const data = await response.json();
    communityEvents = data.map(ev => new Event(ev.name, ev.date, ev.seats, ev.category));
    renderEvents(communityEvents);
    spinner.style.display = "none";
  } catch (error) {
    spinner.textContent = "Failed to load events.";
    console.error("Error loading events:", error);
  }
}

window.onload = () => {
  fetchEventsAsync(); 
};

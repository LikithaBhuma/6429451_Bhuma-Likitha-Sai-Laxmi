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

const renderEvents = (events = []) => {
  container.innerHTML = "";
  events.forEach((eventObj, index) => {
    const { name, date, seats, category } = eventObj;
    
    const card = document.createElement("div");
    card.className = "card";

    const title = document.createElement("h3");
    title.textContent = name;

    const details = document.createElement("p");
    details.textContent = `${date} | ${category}`;

    const seatsInfo = document.createElement("p");
    seatsInfo.textContent = `Seats left: ${seats}`;

    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.onclick = () => {
      if (eventObj.register()) {
        renderEvents([...communityEvents]);
      } else {
        alert("No seats available!");
      }
    };

    const cancelBtn = document.createElement("button");
    cancelBtn.textContent = "Cancel";
    cancelBtn.onclick = () => {
      eventObj.cancel();
      renderEvents([...communityEvents]);
    };

    card.append(title, details, seatsInfo, registerBtn, cancelBtn);
    container.appendChild(card);
  });
};

const fetchEventsAsync = async (url = "events.json") => {
  spinner.style.display = "block";
  try {
    const res = await fetch(url);
    const data = await res.json();
    communityEvents = data.map(({ name, date, seats, category }) => new Event(name, date, seats, category));
    renderEvents([...communityEvents]);
  } catch (err) {
    spinner.textContent = "Failed to load events.";
    console.error("Error loading events:", err);
  } finally {
    spinner.style.display = "none";
  }
};

window.onload = () => {
  fetchEventsAsync();
};

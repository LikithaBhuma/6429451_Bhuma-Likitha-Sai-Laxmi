window.onload = function () {
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

    const communityEvents = [
        new Event("Workshop on Baking", "2025-06-05", 15, "Cooking"),
        new Event("Jazz Night", "2025-06-15", 50, "Music"),
        new Event("Rock Concert", "2025-07-01", 200, "Music"),
        new Event("Gardening 101", "2025-06-20", 25, "Environment")
    ];

    const container = document.querySelector("#eventContainer");

    function renderEvents() {
        container.innerHTML = "";
        communityEvents.forEach((event, index) => {
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
                    renderEvents();
                } else {
                    alert("No seats available!");
                }
            };

            const cancelBtn = document.createElement("button");
            cancelBtn.textContent = "Cancel";
            cancelBtn.onclick = () => {
                event.cancel();
                renderEvents();
            };

            card.appendChild(title);
            card.appendChild(details);
            card.appendChild(seats);
            card.appendChild(registerBtn);
            card.appendChild(cancelBtn);

            container.appendChild(card);
        });
    }

    renderEvents();
};

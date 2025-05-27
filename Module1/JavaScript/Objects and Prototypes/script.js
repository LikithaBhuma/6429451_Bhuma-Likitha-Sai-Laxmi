console.log("Welcome to the Community Portal");
window.onload = function () {
    alert("Page has fully loaded!");
    //  1. Define Event class
    class Event {
        constructor(name, date, seats, category) {
            this.name = name;
            this.date = date;
            this.seats = seats;
            this.category = category;
        }
    }
    //  2. Add checkAvailability() method to prototype
    Event.prototype.checkAvailability = function () {
        const eventDate = new Date(this.date);
        const today = new Date();
        if (eventDate <= today) {
            return "This event has already passed.";
        }
        if (this.seats <= 0) {
            return "No seats available.";
        }
        return `Available: ${this.seats} seats for "${this.name}"`;
    };
    //  3. Create some event objects
    const event1 = new Event("CodeCamp", "2025-07-01", 25, "Education");
    const event2 = new Event("Yoga Retreat", "2025-06-10", 0, "Health");
    const event3 = new Event("Art Workshop", "2025-05-15", 10, "Art");
    const eventList = [event1, event2, event3];
    //  4. Display availability and object details
    console.log("\n🗓️ Event Details & Availability:");
    eventList.forEach(event => {
        console.log(`\n${event.checkAvailability()}`);
        const entries = Object.entries(event);
        entries.forEach(([key, value]) => {
            console.log(`${key}: ${value}`);
        });
    });
};

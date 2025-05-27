console.log("Welcome to the Community Portal");
window.onload = function () {
    alert("Page has fully loaded!");
    class Event {
        constructor(name, date, seats, category) {
            this.name = name;
            this.date = date;
            this.seats = seats;
            this.category = category;
        }
    }
    const communityEvents = [];
    communityEvents.push(
        new Event("Workshop on Baking", "2025-06-05", 15, "Cooking"),
        new Event("Jazz Night", "2025-06-15", 50, "Music"),
        new Event("Rock Concert", "2025-07-01", 200, "Music"),
        new Event("Gardening 101", "2025-06-20", 25, "Environment")
    );
    const musicEvents = communityEvents.filter(event => event.category === "Music");
    const formattedCards = communityEvents.map(event => ` ${event.name} - ${event.date} (${event.category})`);
    console.log(" Music Events:");
    musicEvents.forEach(event => console.log(`${event.name} on ${event.date}`));
    console.log("\n All Event Cards:");
    formattedCards.forEach(card => console.log(card));
};

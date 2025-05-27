console.log("Welcome to the Community Portal");
window.onload = function () {
    alert("Page has fully loaded!");
    // Sample event list
    const events = [];
    // 1. Function to add new events
    function addEvent(name, date, seats, category) {
        events.push({ name, date, seats, category });
    }
    // Add some sample events
    addEvent("Beach Cleanup", "2025-06-30", 10, "Environment");
    addEvent("Tree Plantation", "2025-07-10", 0, "Environment");
    addEvent("JavaScript Workshop", "2025-06-05", 20, "Education");
    addEvent("Music Festival", "2025-08-15", 100, "Entertainment");
    // 2. Closure to track total registrations per category
    function registrationTracker() {
        const categoryCount = {};
        return function registerUser(event) {
            if (event.seats <= 0) {
                console.error(`"${event.name}" is full.`);
                return;
            }
            event.seats--;
            if (!categoryCount[event.category]) {
                categoryCount[event.category] = 1;
            } else {
                categoryCount[event.category]++;
            }
            console.log(`Registered for: ${event.name}. Remaining seats: ${event.seats}`);
            console.log(`Total registrations in ${event.category}: ${categoryCount[event.category]}`);
        };
    }
    // Get the closure-based registerUser function
    const registerUser = registrationTracker();
    //  3. Higher-order function to filter events by custom condition
    function filterEvents(callback) {
        return events.filter(callback);
    }
    // 4. Specific filter function for category
    function filterEventsByCategory(category) {
        return filterEvents(event => event.category === category && event.seats > 0);
    }
    //  5. Display available events by category
    console.log("\n Available 'Environment' Events:");
    filterEventsByCategory("Environment").forEach(event => {
        console.log(`- ${event.name} on ${event.date} | Seats: ${event.seats}`);
    });
    //  6. Test registrations
    console.log("\nRegistration Attempts:");
    const jsWorkshop = events.find(e => e.name === "JavaScript Workshop");
    const treePlantation = events.find(e => e.name === "Tree Plantation");    registerUser(jsWorkshop);         // success
    registerUser(jsWorkshop);         // success
    registerUser(treePlantation);     // error: full
};

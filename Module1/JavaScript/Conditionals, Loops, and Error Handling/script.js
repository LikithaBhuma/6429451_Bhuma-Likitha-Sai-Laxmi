console.log("Welcome to the Community Portal");

window.onload = function () {
    alert("Page has fully loaded!");

    // Sample list of events
    const events = [
        { name: "Beach Cleanup", date: "2025-06-30", seats: 10 },
        { name: "Tree Plantation", date: "2024-12-01", seats: 0 }, // Past event with 0 seats
        { name: "Coding Bootcamp", date: "2025-05-25", seats: 5 },
        { name: "Local Music Fest", date: "2023-11-11", seats: 100 } // Past event
    ];

    const today = new Date();

    // Filter and display valid events
    console.log("Available Upcoming Events:");
    events.forEach(event => {
        const eventDate = new Date(event.date);

        if (eventDate > today && event.seats > 0) {
            console.log(`- ${event.name} on ${event.date} | Seats: ${event.seats}`);
        } else {
            console.log(`(Hidden) ${event.name} - Not valid (past or full)`);
        }
    });

    // Registration logic wrapped in try-catch
    function register(event) {
        try {
            if (event.seats <= 0) {
                throw new Error(`Sorry, "${event.name}" is fully booked.`);
            }

            event.seats--;
            console.log(`You are registered for ${event.name}. Remaining seats: ${event.seats}`);
        } catch (error) {
            console.error("Registration Failed:", error.message);
        }
    }

    // Test registration
    console.log("\n--- Registration Attempts ---");
    register(events[0]); // Should succeed
    register(events[1]); // Should fail (seats = 0)
    register(events[2]); // Should succeed
};

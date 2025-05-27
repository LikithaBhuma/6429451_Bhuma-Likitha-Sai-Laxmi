// Event Details
const eventName = "Community Clean-Up Drive";
const eventDate = "2025-06-15";
let availableSeats = 50;

// Display event info using template literals
const eventInfo = `Event: ${eventName}\nDate: ${eventDate}\nSeats Available: ${availableSeats}`;
console.log(eventInfo);

// Simulate user registration
console.log("Registering a user...");
availableSeats--; // One seat taken
console.log(`Seats left after registration: ${availableSeats}`);

// Another registration
availableSeats--;
console.log(`Seats left after another registration: ${availableSeats}`);

// Simulate a cancellation
availableSeats++;
console.log(`Seats available after a cancellation: ${availableSeats}`);

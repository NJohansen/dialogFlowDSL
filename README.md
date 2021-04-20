# A generic DSL for generating agent for Google dialogFlow ES

The syntax for the language can be seen in the examples `dialogFlow.df`, `alarm.df` and `flightBooking.df`.

This is just one of the examples.
```
system Booking
  entity venue_accomodation_chain 
    reference "Hilton" 
    reference "Hilton one" synonym "Hotel two"
  entity venue_accomodation_type
    reference "apartment” synonyms “apartments"
    reference "hotel" synonym "hotels" 
    reference "motel" synonym "motels" 
  entity star 
    reference "1" synonyms "1 or more", "1 star" 
    reference "2" synonyms "2 or more", "2 star"
  intent Welcome 
    phrases
      expression "Hello" 
      expression "Hi"
    responses 
      reply "Welcome. I can help you book a hotel. Would you like to book a hotel room?"
      reply "Hello. Would you like to book a hotel room?"
      reply "Hi there. I can help you book a hotel room. Would you like to book a hotel room?"
  intent Book
    phrases
      expression "book suite in ", "Hilton" as venue_accomodation_type 
      expression "book ", "1 star " as star, "motel " as venue_accomodation_type, "room" 
    responses 
      reply "I need some more information."
      reply  "Okay I have booked a room of $venue-type with $star star"
    actions 
      param venue_type type venue_accomodation_type "venue-type" 
      param venue_chain type venue_accomodation_chain "venue-chain" islist
      param star type star "star" 
```

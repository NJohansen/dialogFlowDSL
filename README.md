# A generic DSL for generating agents for Google dialogFlow ES

The syntax for the language can be seen in the examples `hotelBookingTemplate.df`, `alarm.df` and `flightBooking.df`.

An example which uses inheritance to support multiple systems in one program can be seen here:
```
system HotelBookingTemplate 
  entity star 
  	reference "1 star" 
  	reference "2 stars"
  	reference "3 stars"
  	reference "4 stars"
  	reference "5 stars"
  entity hotelcountry 
    reference "Denmark" 
    reference "Germany"
    reference "USA"
      
system HiltonDenmarkBooking extends HotelBookingTemplate   
  entity hilton_accomodation_type 
    reference "apartment" synonyms "apartments"
    reference "hotel" synonyms "hotels"
    reference "motel" synonyms "motels"
  entity hilton_room_type 
    reference "Hilton King suite"  
    reference "2-persons suite"  
    reference "4-persons suite" 
  intent WelcomeHilton 
    phrases
      expression "Can i book a room on a Hilton hotel?"  
    responses 
      reply "I have the room types $hilton-room-type in Denmark, but i also have hotels in these following $hotelcountries ?"
    actions 
      param hilton_room_type type hilton_room_type  "hilton-room-type" 
      param hotelcountry type hotelcountry "hotelcountries" 
      
system HiltonOdenseBooking extends HiltonDenmarkBooking      
  entity odense_locations 
    reference "Odense SØ" 
    reference "Kerteminde" synonyms "Kærteminde"  
    reference "Dalum" 
  intent BookOdense
    phrases
      expression "Book ", "5 star" as star, " hilton hotel in", " Odense" as odense_locations  
    responses 
      reply "I have these locations in Odense $odenselocations with these roomtypes $hilton-room-type ?"
    actions 
      param hilton_room_type type hilton_room_type "hilton-room-type"
      param star type star "star"
      param odense_locations type odense_locations "odenselocations"

system ComwellBooking extends HotelBookingTemplate      
  intent BookComwell
    phrases
      expression "Can i book a ", " 5 star" as star, " comwell hotel in ", " denmark" as hotelcountry      
    responses 
      reply "Okay. I have reserved $star star hotel in $location"
    actions 
      param hotelcountry type hotelcountry "location" 
      param star type star "star" 
```

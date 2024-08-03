package org.example.getapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//When you use @Embeddable and @Embedded, you do not need to map class B as a separate entity with its own table in the database.
//Instead, the fields of class B will be embedded into the table of class A
//import jakarta.persistence.Embeddable;  >>> goes on the class whose object will be embedded in another class
//import jakarta.persistence.*; >>> goes in the class whose object will be embedded in another class

//initializing surfline JSON data occurs at 11pm pst

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurfSpots {
 //key for synching data on database that will likely be several objects as opposed to raw values
 //I am not sure if the composition objects need to be mapped???

 /* @JsonProperty("timestamp")
 Long timestamp;
 @JsonProperty("utcOffset")
 Integer utcOffset;
*/

 Double latitude;
 Double longitude;

 SurfLine_rating surfLineRating;
 SurfLine_sunlight surfLineSunlight;
 SurfLine_surf surfLineSurf;
 SurfLine_swells surfLineSwells;
 SurfLine_tides surfLineTides;

 //Surf Spot Image and Potential Video Link will be stored on the client facing side of the application

}

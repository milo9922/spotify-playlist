This app connects to Spotify API using OAuth2 token, gets list of tracks by given artist and saves tracks to mongoDb.

                         Available mappings:

  /hello               - authenticates to api necessary to use next mapping. 
                         Shows info about authenticated user and session.

  /album/{artistName}  - returns list of songs using JSON   {  track name,
                                                               url to album image }
                                                          
  /add-track           - saves JSON (track) to mongoDb. It requires trackName parameter as JSON body to save.
                         Save can be done using tool like Postman. Example of correct body:
                          {
                         "trackName": "BURN IT DOWN"
                          }

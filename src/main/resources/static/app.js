const app = document.querySelector("#app");

app.textContent = "Hello JS!";

fetch("/artists")
  .then(response => response.json())
  .then(artists => {
    let content = `<ul class="artists">`;
    artists.forEach(artist => {
      content += `
			 	<li class="artist">
           <h3 class="artist__name">${artist.artistName}</h3>
           <img src=${artist.artistImage} alt="image">
			 		<ul class="albums">
			 			${artist.albums
              .map(album => {
                return `
								<li class="album">
                  <h5 class="album__title">${album.albumTitle}</h5>

                  <img src=${album.albumCover} alt="image">
                  <ul class="albums">
                    ${album.songs
                    .map(song => {
                      return `
                      <li class="song">
                        <h5 class="song__title">${song.songTitle}</h5>
                      </li>
                    `;
                    })
                    .join("")}
                  </ul>
								</li>
							`;
              })
              .join("")}
			 		</ul>
			 	</li>
		 	`;
    });
    content += `</ul>`;
    app.innerHTML = content;
  })
  .catch(err => console.log(err));

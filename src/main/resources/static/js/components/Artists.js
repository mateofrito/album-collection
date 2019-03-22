import Albums from './Albums'

export default function Artists(artists) {
    return `
      <ul class="artists">
        ${artists.map(artist => {
        return `
                <li class="artist">
                <img class="artist__image" src="${artist.artistImage}" alt="Artist Image">
                <h3 class="artist__name">${artist.artistName}</h3>
                <ul class="albums">
                    ${Albums(artist.albums)}
                </ul>
                </li>
            `;
    }).join('')}
    </ul>
    <section class="add-artist">
    <input class= "add-artist__artistName" type = "text" placeholder= "Artist Name">
    <input class= "add-artist__artistImage" type = "text" placeholder= "Artist Image">
    <input class= "add-artist__artistRating" type = "text" placeholder= "Artist Rating">
    <button class="add-artist__submit">Submit</button>
    </section>
  `;
}
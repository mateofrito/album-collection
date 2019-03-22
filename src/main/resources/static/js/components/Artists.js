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
  `
}
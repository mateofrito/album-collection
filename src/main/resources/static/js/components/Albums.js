import Songs from './Songs'

export default function Albums(albums) {
    return `
      <ul class="albums">
        ${albums.map(album => {
        return `
                <li class="album">
                <img class="album__cover" src="${album.albumCover}" alt="Album Cover">
                <h3 class="album__title">${album.albumTitle}</h3>
                <ul class="books">
                    ${Songs(album.songs)}
                </ul>
                </li>
            `;
    }).join('')}
    </ul>
  `;
}


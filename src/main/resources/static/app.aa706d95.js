parcelRequire=function(e,r,t,n){var i,o="function"==typeof parcelRequire&&parcelRequire,u="function"==typeof require&&require;function f(t,n){if(!r[t]){if(!e[t]){var i="function"==typeof parcelRequire&&parcelRequire;if(!n&&i)return i(t,!0);if(o)return o(t,!0);if(u&&"string"==typeof t)return u(t);var c=new Error("Cannot find module '"+t+"'");throw c.code="MODULE_NOT_FOUND",c}p.resolve=function(r){return e[t][1][r]||r},p.cache={};var l=r[t]=new f.Module(t);e[t][0].call(l.exports,p,l,l.exports,this)}return r[t].exports;function p(e){return f(p.resolve(e))}}f.isParcelRequire=!0,f.Module=function(e){this.id=e,this.bundle=f,this.exports={}},f.modules=e,f.cache=r,f.parent=o,f.register=function(r,t){e[r]=[function(e,r){r.exports=t},{}]};for(var c=0;c<t.length;c++)try{f(t[c])}catch(e){i||(i=e)}if(t.length){var l=f(t[t.length-1]);"object"==typeof exports&&"undefined"!=typeof module?module.exports=l:"function"==typeof define&&define.amd?define(function(){return l}):n&&(this[n]=l)}if(parcelRequire=f,i)throw i;return f}({"cKmy":[function(require,module,exports) {

},{}],"9pZY":[function(require,module,exports) {
"use strict";function e(e,t){fetch(e).then(function(e){return e.json()}).then(function(e){return t(e)}).catch(function(e){return console.log(e)})}Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=void 0;var t={getRequest:e};exports.default=t;
},{}],"JqfT":[function(require,module,exports) {
"use strict";function n(n){return n.map(function(n){return'\n                <li class="song">\n                    <h5 class="song__title">'.concat(n.songTitle,"</h5>\n                </li>\n            ")}).join("")}Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=n;
},{}],"Th3n":[function(require,module,exports) {
"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=e;var n=l(require("./Songs"));function l(n){return n&&n.__esModule?n:{default:n}}function e(l){return'\n      <ul class="albums">\n        '.concat(l.map(function(l){return'\n                <li class="album">\n                <img class="album__cover" src="'.concat(l.albumCover,'" alt="Album Cover">\n                <h3 class="album__title">').concat(l.albumTitle,'</h3>\n                <ul class="books">\n                    ').concat((0,n.default)(l.songs),"\n                </ul>\n                </li>\n            ")}).join(""),"\n    </ul>")}
},{"./Songs":"JqfT"}],"AE3x":[function(require,module,exports) {
"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=n;var t=a(require("./Albums"));function a(t){return t&&t.__esModule?t:{default:t}}function n(a){return'\n      <ul class="artists">\n        '.concat(a.map(function(a){return'\n                <li class="artist">\n                <img class="artist__image" src="'.concat(a.artistImage,'" alt="Artist Image">\n                <h3 class="artist__name">').concat(a.artistName,'</h3>\n                <ul class="albums">\n                    ').concat((0,t.default)(a.albums),"\n                </ul>\n                </li>\n            ")}).join(""),"\n    </ul>\n  ")}
},{"./Albums":"Th3n"}],"GFX4":[function(require,module,exports) {
"use strict";require("../css/styling.css");var e=u(require("./utils/api/api-action")),t=u(require("./components/Artists"));function u(e){return e&&e.__esModule?e:{default:e}}function n(){e.default.getRequest("/artists",function(e){r().innerHTML=(0,t.default)(e)})}function r(){return document.querySelector("#app")}n();
},{"../css/styling.css":"cKmy","./utils/api/api-action":"9pZY","./components/Artists":"AE3x"}]},{},["GFX4"], null)
//# sourceMappingURL=/app.aa706d95.js.map
const printBanner = () => {
  const bannerArr = []
  bannerArr.push(` ▄▄▌ ▐ ▄▌      ▄▄▄  ▄ •▄  ▄▄ • ▄▄▄        ▄• ▄▌ ▄▄▄· `);
  bannerArr.push(` ██· █▌▐█▪     ▀▄ █·█▌▄▌▪▐█ ▀ ▪▀▄ █·▪     █▪██▌▐█ ▄█ `);
  bannerArr.push(` ██▪▐█▐▐▌ ▄█▀▄ ▐▀▀▄ ▐▀▀▄·▄█ ▀█▄▐▀▀▄  ▄█▀▄ █▌▐█▌ ██▀· `);
  bannerArr.push(` ▐█▌██▐█▌▐█▌.▐▌▐█•█▌▐█.█▌▐█▄▪▐█▐█•█▌▐█▌.▐▌▐█▄█▌▐█▪·• `);
  bannerArr.push(`  ▀▀▀▀ ▀▪ ▀█▄▀▪.▀  ▀·▀  ▀·▀▀▀▀ .▀  ▀ ▀█▄▀▪ ▀▀▀ .▀    `);
  bannerArr.push(`                                   shortcut.js v1.0 `);
  console.log(bannerArr.join('\n'))
}

printBanner()
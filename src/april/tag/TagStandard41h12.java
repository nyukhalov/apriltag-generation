/* Copyright (C) 2013-2016, The Regents of The University of Michigan.
All rights reserved.
This software was developed in the APRIL Robotics Lab under the
direction of Edwin Olson, ebolson@umich.edu. This software may be
available under alternative licensing terms; contact the address above.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
The views and conclusions contained in the software and documentation are those
of the authors and should not be interpreted as representing official policies,
either expressed or implied, of the Regents of The University of Michigan.
*/

package april.tag;

/** Tag family with 2115 distinct codes.
    bits: 41,  minimum hamming: 12,  minimum complexity: 10

    Max bits corrected       False positive rate
            0                  0.00000010 %
            1                  0.00000404 %
            2                  0.00008291 %
            3                  0.00110818 %
            4                  0.01084823 %
            5                  0.08292463 %

    Generation time: 44384.418000 s

    Hamming distance between pairs of codes (accounting for rotation):

       0  0
       1  0
       2  0
       3  0
       4  0
       5  0
       6  0
       7  0
       8  0
       9  0
      10  0
      11  0
      12  46347
      13  65141
      14  156761
      15  202454
      16  327635
      17  366600
      18  366294
      19  331551
      20  181417
      21  127959
      22  38012
      23  20327
      24  3507
      25  1368
      26  136
      27  44
      28  2
      29  0
      30  0
      31  0
      32  0
      33  0
      34  0
      35  0
      36  0
      37  0
      38  0
      39  0
      40  0
      41  0
**/
public class TagStandard41h12 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0x1bd8a64ad10L, 0x1bdc4f3b2d5L, 0x1bdff82b89aL, 0x1be3a11be5fL, 0x1be74a0c424L, 0x1beaf2fc9e9L, 0x1bee9becfaeL, 0x1bf244dd573L, 0x1bf5edcdb38L, 0x1bf996be0fdL, 0x1bfd3fae6c2L, 0x1c00e89ec87L, 0x1c04918f24cL, 0x1c0be36fdd6L, 0x1c0f8c6039bL, 0x1c133550960L, 0x1c16de40f25L, 0x1c21d912074L, 0x1c258202639L, 0x1c292af2bfeL, 0x1c307cd3788L, 0x1c37ceb4312L, 0x1c3b77a48d7L, 0x1c3f2094e9cL, 0x1c42c985461L, 0x1c4a1b65febL, 0x1c4dc4565b0L, 0x1c516d46b75L, 0x1c55163713aL, 0x1c63b9f884eL, 0x1c6762e8e13L, 0x1c6eb4c999dL, 0x1c725db9f62L, 0x1c7606aa527L, 0x1c7d588b0b1L, 0x1c81017b676L, 0x1c84aa6bc3bL, 0x1c88535c200L, 0x1c8bfc4c7c5L, 0x1c96f71d914L, 0x1c9e48fe49eL, 0x1ca1f1eea63L, 0x1ca59adf028L, 0x1cb095b0177L, 0x1cb43ea073cL, 0x1cbb90812c6L, 0x1cc68b52415L, 0x1cca34429daL, 0x1ccddd32f9fL, 0x1cd18623564L, 0x1cd8d8040eeL, 0x1cdc80f46b3L, 0x1ce029e4c78L, 0x1ce77bc5802L, 0x1ceb24b5dc7L, 0x1ceecda638cL, 0x1cf27696951L, 0x1cf9c8774dbL, 0x1d086c38befL, 0x1d136709d3eL, 0x1d1ab8ea8c8L, 0x1d25b3bba17L, 0x1d295cabfdcL, 0x1d30ae8cb66L, 0x1d3f524e27aL, 0x1d42fb3e83fL, 0x1d46a42ee04L, 0x1d4a4d1f3c9L, 0x1d519efff53L, 0x1d5547f0518L, 0x1d5c99d10a2L, 0x1d6042c1667L, 0x1d6794a21f1L, 0x1d6ee682d7bL, 0x1d763863905L, 0x1d7d8a4448fL, 0x1d813334a54L, 0x1d84dc25019L, 0x1d8885155deL, 0x1d8c2e05ba3L, 0x1d8fd6f6168L, 0x1d9e7ab787cL, 0x1da5cc98406L, 0x1da975889cbL, 0x1db0c769555L, 0x1db47059b1aL, 0x1dbbc23a6a4L, 0x1dbf6b2ac69L, 0x1dca65fbdb8L, 0x1dce0eec37dL, 0x1ddcb2ada91L, 0x1df651402f4L, 0x1df9fa308b9L, 0x1e014c11443L, 0x1e223c84830L, 0x1e25e574df5L, 0x1e383226aceL, 0x1e3bdb17093L, 0x1e4a7ed87a7L, 0x1e4e27c8d6cL, 0x1e51d0b9331L, 0x1e592299ebbL, 0x1e60747aa45L, 0x1e67c65b5cfL, 0x1e6b6f4bb94L, 0x1e766a1cce3L, 0x1e9008af546L, 0x1e9eac70c5aL, 0x1ea2556121fL, 0x1ead503236eL, 0x1eb84b034bdL, 0x1edce466e6fL, 0x1eeb8828583L, 0x1eef3118b48L, 0x1ef2da0910dL, 0x1f0526bade6L, 0x1f10218bf35L, 0x1f1b1c5d084L, 0x1f226e3dc0eL, 0x1f34baef8e7L, 0x1f3c0cd0471L, 0x1f435eb0ffbL, 0x1f55ab62cd4L, 0x1f5cfd4385eL, 0x1f67f8149adL, 0x1f7dedb6c4bL, 0x1f88e887d9aL, 0x1f8c917835fL, 0x1f903a68924L, 0x1f9b3539a73L, 0x1fa9d8fb187L, 0x1fd21b4f0feL, 0x1fd5c43f6c3L, 0x1fe0bf10812L, 0x00558741c4L, 0x00caa54d4eL, 0x013fc358d8L, 0x02d9ac813bL, 0x034eca8cc5L, 0x038959928aL, 0x043906a3d9L, 0x04ae24af63L, 0x04e8b3b528L, 0x052342baedL, 0x0857150bb3L, 0x09b66f2e51L, 0x0adb3a4b2aL, 0x0b8ae75c79L, 0x0e499ba1b5L, 0x0f6e66be8eL, 0x10cdc0e12cL, 0x1142deecb6L, 0x1351e620a3L, 0x143c2237b7L, 0x17356582b8L, 0x17aa838e42L, 0x181fa199ccL, 0x18cf4eab1bL, 0x19446cb6a5L, 0x1aa3c6d943L, 0x1b8e02f057L, 0x1bc891f61cL, 0x1e4cb73593L, 0x22303697a8L, 0x231a72aebcL, 0x23ca1fc00bL, 0x2688d40547L, 0x26c3630b0cL, 0x2738811696L, 0x27e82e27e5L, 0x290cf944beL, 0x2b568f7e70L, 0x2b911e8435L, 0x2c063c8fbfL, 0x2cb5e9a10eL, 0x2d2b07ac98L, 0x2e1543c3acL, 0x2e4fd2c971L, 0x2f3a0ee085L, 0x31f8c325c1L, 0x326de1314bL, 0x35a1b38211L, 0x3651609360L, 0x368bef9925L, 0x373b9caa74L, 0x37b0bab5feL, 0x3b1f1c0c89L, 0x3b59ab124eL, 0x3bcec91dd8L, 0x3c0958239dL, 0x3d68b2463bL, 0x3e185f578aL, 0x3e52ee5d4fL, 0x42366dbf64L, 0x4320a9d678L, 0x435b38dc3dL, 0x4395c7e202L, 0x444574f351L, 0x452fb10a65L, 0x45a4cf15efL, 0x4aad1994ddL, 0x4e5609f12dL, 0x506511251aL, 0x52e9366491L, 0x535e54701bL, 0x53d3727ba5L, 0x54831f8cf4L, 0x565797bb1cL, 0x5bd5004594L, 0x5c0f8f4b59L, 0x5de4077981L, 0x5f08d2965aL, 0x602d9db333L, 0x64c0ca2697L, 0x6535e83221L, 0x65e5954370L, 0x665ab34efaL, 0x66cfd15a84L, 0x67ba0d7198L, 0x682f2b7d22L, 0x6953f699fbL, 0x69c914a585L, 0x6a03a3ab4aL, 0x6b286ec823L, 0x6c87c8eac1L, 0x6d720501d5L, 0x6f810c35c2L, 0x6fbb9b3b87L, 0x71caa26f74L, 0x73648b97d7L, 0x741438a926L, 0x757392cbc4L, 0x7dea3ea13dL, 0x7ed47ab851L, 0x827d6b14a1L, 0x82f289202bL, 0x832d1825f0L, 0x8367a72bb5L, 0x83dcc5373fL, 0x886ff1aaa3L, 0x8a09dad306L, 0x8a4469d8cbL, 0x8cc88f1842L, 0x8d3dad23ccL, 0x8ded5a351bL, 0x8f87435d7eL, 0x90717f7492L, 0x915bbb8ba6L, 0x92f5a4b409L, 0x974e4221a8L, 0x9997d85b5aL, 0x9a47856ca9L, 0x9e2b04cebeL, 0xa0e9b913faL, 0xa36dde5371L, 0xa8b0b7d824L, 0xa8eb46dde9L, 0xaa1011fac2L, 0xac59a83474L, 0xafc8098affL, 0xb24c2eca76L, 0xb2fbdbdbc5L, 0xb3e617f2d9L, 0xb545721577L, 0xba132d8ea0L, 0xc005b424a2L, 0xc3e93386b7L, 0xc5488da955L, 0xc5f83abaa4L, 0xc9669c112fL, 0xcdbf397eceL, 0xce34578a58L, 0xcea97595e2L, 0xd426de205aL, 0xdbeddce484L, 0xddc25512acL, 0xe75dcc04feL, 0xebb669729dL, 0xef99e8d4b2L, 0xf0f942f750L, 0xf342d93102L, 0xf6ebc98d52L, 0xfa1f9bde18L, 0xfb09d7f52cL, 0xfbf4140c40L, 0xfeed575741L, 0x10345f4c4e0L, 0x1051a6cf308L, 0x1084e3f43ceL, 0x109387b5ae2L, 0x109e8286c31L, 0x10a5d4677bbL, 0x10b0cf3890aL, 0x10c31bea5e3L, 0x10d5689c2bcL, 0x10e0636d40bL, 0x1129963476fL, 0x113839f5e83L, 0x11a25d305d4L, 0x11b4a9e22adL, 0x11bbfbc2e37L, 0x11dcec36224L, 0x11ef38e7efdL, 0x11f68ac8a87L, 0x11fddca9611L, 0x12018599bd6L, 0x12052e8a19bL, 0x12a9e0ca53cL, 0x13056043579L, 0x13523bfaea2L, 0x140ce3dd4e1L, 0x142dd4508ceL, 0x14a2f25c16eL, 0x14aded2d2bdL, 0x14e12a52383L, 0x152a5d196e7L, 0x153557ea836L, 0x154052bb985L, 0x154b4d8cad4L, 0x154ef67d099L, 0x157ae1c15d5L, 0x157e8ab1b9aL, 0x15b1c7d6c60L, 0x162e37c308aL, 0x169c03edda0L, 0x16ec8895c8eL, 0x16f3da76818L, 0x171121f9640L, 0x182af245281L, 0x18aeb412235L, 0x18b9aee3384L, 0x1920292d510L, 0x195e6123725L, 0x19ab3cdb04eL, 0x19bd898cd27L, 0x19d37f2efc5L, 0x1a2b55b7a3dL, 0x1a6d369e217L, 0x1adeabb94f2L, 0x1b3dd422af4L, 0x1ba7f75d245L, 0x1bb2f22e394L, 0x1c15c387f5bL, 0x1c6d9a109d3L, 0x1cc91989a10L, 0x1d83c16c04fL, 0x1e127e0a152L, 0x1e42123ec53L, 0x1e6dfd8318fL, 0x1e879c159f2L, 0x1f75811d0f7L, 0x1f87cdcedd0L, 0x1f8f1faf95aL, 0x0168a6ced3L, 0x0a19e1aa11L, 0x0b3eacc6eaL, 0x0e37f011ebL, 0x1081864b9dL, 0x188314158cL, 0x1f5fd6c2a2L, 0x216eddf68fL, 0x38fe6948d2L, 0x3fa09cf023L, 0x41ea3329d5L, 0x4caa753900L, 0x4dcf4055d9L, 0x52d78ad4c7L, 0x56807b3117L, 0x58ca116ac9L, 0x5ebc9800cbL, 0x6265885d1bL, 0x70942bc2d1L, 0x738d6f0dd2L, 0x7adf4fc672L, 0x85da20db62L, 0x8a6d4d4ec6L, 0x8ae26b5a50L, 0x8b92186b9fL, 0x8ec5eabc65L, 0x96525a7acaL, 0xa0d80d8430L, 0xa5a5c8fd59L, 0xa9142a53e4L, 0xb48419745eL, 0xb86798d673L, 0xc6963c3c29L, 0xca3f2c9879L, 0xf0e7976786L, 0xf41b69b84cL, 0xfe668dbbedL, 0xff163acd3cL, 0x1015fd106eeL, 0x10fc9037269L, 0x11e6cc4e3a9L, 0x136716e4176L, 0x13f97c7283eL, 0x142567b6d7aL, 0x148f8af14cbL, 0x14a92983d2eL, 0x14ca19f711bL, 0x14d16bd7ca5L, 0x157d6ff8bd0L, 0x15eee513eabL, 0x16ca7d698d7L, 0x174a96462c6L, 0x17593a079daL, 0x177a2a7adc7L, 0x1808e718ecaL, 0x181038f9a54L, 0x190918d22a8L, 0x19e1083770fL, 0x1ac3f26dcc5L, 0x1b47b43ac79L, 0x1b8d3e11a18L, 0x1bbcd246519L, 0x1efb9f682c8L, 0x05af98aca8L, 0x26a00beb78L, 0x5808b8c9b0L, 0x654d201852L, 0x7c2cfe5946L, 0x8d1a560438L, 0xa4e4705c40L, 0xa81842ad06L, 0xbce919ba0dL, 0xc5253689c1L, 0xd4edc317daL, 0xeaa8d63bf5L, 0x10fb757e29fL, 0x119c7ece07bL, 0x137bf1cd44aL, 0x141cfb1d226L, 0x15c58806f6aL, 0x165444a506dL, 0x16babeef1f9L, 0x16d0b491497L, 0x1875988ac16L, 0x190f4ff9e68L, 0x198f68d6857L, 0x1a60065b134L, 0x1ad17b7640fL, 0x1af26be97fcL, 0x1b22001e2fdL, 0x1b469981cafL, 0x1b84d177ec4L, 0x1b9ac71a162L, 0x1ba5c1eb2b1L, 0x1ce42b9a8a4L, 0x1d13bfcf3a5L, 0x1dad773e5f7L, 0x1dcabec141fL, 0x1e01a4d6aaaL, 0x1e1048981beL, 0x1e388aec135L, 0x1e97b355737L, 0x1fe4c0c643eL, 0x15db97b681L, 0x42eba7271aL, 0x444b0149b8L, 0x4bd771081dL, 0x7fc44325ccL, 0x992846a637L, 0x9b71dcdfe9L, 0xb71f769a06L, 0xc254d6b4bbL, 0xe5c96f3302L, 0xf8c5ce11e1L, 0xfe08a79694L, 0x1090378ab84L, 0x1093e07b149L, 0x10bc22cf0c0L, 0x10ef5ff4186L, 0x11b502a7914L, 0x126858a93c9L, 0x12b53460cf2L, 0x142a8425970L, 0x15f7aa73066L, 0x1a0e66fa27cL, 0x1d5bd7dd73fL, 0x1ddf99aa6f3L, 0x10c1a1a7c9L, 0x1b81e3b6f4L, 0x21e9885880L, 0x259278b4d0L, 0x3ad86dcd61L, 0x3ef67c353bL, 0x99169b166dL, 0xa2eca10e84L, 0xb4fec3d64fL, 0xb70dcb0a3cL, 0xb832962715L, 0xcbdea21743L, 0xced7e56244L, 0xde65e2ea98L, 0xf002e7a6d9L, 0x12589a2ecebL, 0x149e8778246L, 0x1672ffa64c6L, 0x1be56d5faf7L, 0x1ec8bb08869L, 0x1f5777a696cL, 0x17c747cadaL, 0x454c7546fdL, 0x7d91e4d24bL, 0xbb1a2de24cL, 0x1070ba95dc8L, 0x1274c6f8b49L, 0x12920e7b971L, 0x14a4be9fe06L, 0x15003e18e43L, 0x17f22f832c9L, 0x1f3cbe5b13fL, 0x1fd2ccd9dccL, 0x1cbde6b9feL, 0x1ff1b90ac4L, 0x2cfb9153a1L, 0x302f63a467L, 0x4e61229dfbL, 0xa00a95a9b4L, 0xb21cb8717fL, 0xdd584fb3f0L, 0x12615f8dea6L, 0x12f76e0cb33L, 0x13fb48b64d6L, 0x16e5e83fdd2L, 0x170a81a3784L, 0x19506eeccdfL, 0x1aa4ce3e570L, 0x58257d0648L, 0x640a8a324cL, 0x7e9358cf90L, 0x8b28130ce3L, 0xc4ccdcbacfL, 0xc71672f481L, 0xd45ada4323L, 0x1181038eeebL, 0x14dd1833ac2L, 0x163c72564a2L, 0x17ec5120d70L, 0x2dfd0550e6L, 0x484b44e865L, 0x79b3f1c69dL, 0xc6551a5368L, 0xee976e4ad8L, 0x11f506e17c1L, 0x15636838071L, 0x17eedf5836bL, 0x1a55bd14cb3L, 0x1f8d9bc8694L, 0x33a3515159L, 0x580225e6b4L, 0x637215072eL, 0xc0c6063926L, 0x1565f66f66cL, 0x15db147af0cL, 0x18cd05e5392L, 0x1b2c91c1150L, 0x8cc7888badL, 0x136821344abL, 0x1631d04a9baL, 0x1b91f152312L, 0x1cd403f1ecaL, 0x1d1d36b922eL, 0x1f129f5a89bL, 0x2bb8fb6d9bL, 0x6bc569bd13L, 0x113ab7c47e9L, 0x1166a308d25L, 0x131a2ac3bb8L, 0x170c4de741cL, 0x1cf7829c8b2L, 0x1e39953c46aL, 0x0db01fea02L, 0x82ce2b7402L, 0xaa60d25a23L, 0xb645df8627L, 0xb6806e8becL, 0xcdd56ad86aL, 0x12954e3dc3aL, 0x13fbfa411a4L, 0x182c555ac1dL, 0x19e72ef663aL, 0x1a4a0050201L, 0x1af25b80b67L, 0x1b552cda72eL, 0x1bb0ac5376bL, 0x1d43439b211L, 0x0e88b0714cL, 0x27ecb3f1b7L, 0x5cc3c2267aL, 0xbbec2b869aL, 0xfa993fb374L, 0x111ee3bfff2L, 0x16c0e5ae124L, 0x18e23993ccdL, 0x17d7ecce0fL, 0x72a7b8c090L, 0x7cf2dcc431L, 0xa9533f237bL, 0xe039548c2bL, 0x101d974dc4aL, 0x143f4ea5fafL, 0x147634bb63aL, 0x15f2d660e42L, 0x16386037be1L, 0x180cd865e61L, 0x1b2e5e04de8L, 0x1b4ba587c10L, 0x2127292ad2L, 0x71abd119b2L, 0x7220ef253cL, 0x8d93f9d994L, 0xc59eda5f1dL, 0xd7b0fd26e8L, 0x17dfd26895bL, 0x1c177f62f5eL, 0x1c854b8dc74L, 0x1f6899369e6L, 0x1035006e519L, 0x12b925adc89L, 0x15b9bad9823L, 0x1a927123c02L, 0x155953e4ffL, 0x6ae64652cdL, 0xd4cef1c218L, 0xe3ad42391dL, 0x15c39af19a8L, 0x192aaa676ceL, 0x1bb621879c8L, 0xa52911823eL, 0xac05d42f54L, 0xdda9101351L, 0x1842fc87b89L, 0x1f4691c347L, 0xbce1804a7cL, 0x10c06ce16beL, 0x14b638f54e7L, 0x1f6b8033648L, 0x0f31ca9f9fL, 0x2c042f7695L, 0xf4659734b1L, 0xff25d943dcL, 0x1ade8ae7bc8L, 0x1c836ee1347L, 0x2a1e0bb8a3L, 0x3eb453bfe5L, 0xfdb4d39174L, 0x1843554d1f0L, 0x1c68b595b1aL, 0x51d99614bfL, 0x18dbf203478L, 0x1f76d3c9dfeL, 0x7f1288fb53L, 0xaa139137ffL, 0xb5be0f5e3eL, 0x15c7f56cc3bL, 0x1a11ef18f17L, 0x1cfc8ea2813L, 0xeba83d2010L, 0x181f14aeea5L, 0x00aacd6af7L, 0x4bec9bd524L, 0x54d865b627L, 0x1758574274dL, 0x6e654cac8dL, 0x1156123204fL, 0x122a58a6ef1L, 0x1d07e238fc9L, 0x1f3b82d084bL, 0x7f0669c1f0L, 0x9a3ee57083L, 0x11cdbe74eeaL, 0x1717e9da5a4L, 0x174b26ff66aL, 0x158130ce65L, 0xacef09b9d3L, 0x178f961d43fL, 0x1a6097144d8L, 0x1d145088749L, 0x1b620bd49dL, 0x16d77c723fbL, 0xf046824042L, 0x13d5cc8d897L, 0x6d5d45cc4cL, 0x1407eef9993L, 0x16552e23a78L, 0x1d18523e375L, 0x0d38f4c54eL, 0x1996897ce22L, 0x19bdb117dcfL, 0x1d19c5bc9a6L, 0x1d6df354e59L, 0x7898323d68L, 0x10545c919abL, 0x15938d25f16L, 0x194b2143b2aL, 0x387a185e26L, 0xd4408eb733L, 0x11ed2b01011L, 0x1436c13ab31L, 0x16840064c16L, 0x1d81b385163L, 0x97cb653441L, 0x1c791532231L, 0x1e8f6e46c8bL, 0x7654285a1dL, 0xfe6e92c2fcL, 0x19dddf97859L, 0x8d225b0b47L, 0x10623e5f75cL, 0x1bdd285104bL, 0x4ffd847706L, 0x1bc617f5de3L, 0x4e1760b914L, 0x157aa01e381L, 0xa9fa4c38a4L, 0x10617c6bdf9L, 0x10826cdf1e6L, 0x1386aafb345L, 0xf3329fc54bL, 0x1caace70031L, 0x032ce59144L, 0x0f11f2bd48L, 0x9557e4f7ffL, 0x106cd0025afL, 0x7f8b26441aL, 0xa499a7eac4L, 0x151b0e86a83L, 0x354acbd732L, 0xa7aa231bf6L, 0x3748277b55L, 0x5ccbc72d89L, 0x139c376f2e7L, 0x08b566c88aL, 0xba36f045b2L, 0x17be478ccb3L, 0x1f7930c6e3aL, 0x5b4ea241beL, 0x2abe85ead0L, 0x10aaf78fb2fL, 0x79227b15f9L, 0x15e1bb8a546L, 0x194c73f0831L, 0x1e1686794fcL, 0x1e252a3ac10L, 0xa86a75307aL, 0x1701c2fdd47L, 0x1728ea98cf4L, 0x1aca891466aL, 0x107e4a57c90L, 0x1409f331368L, 0x19666b486fbL, 0x42304673e6L, 0x1873c297a67L, 0x7645fc0790L, 0x148084bb239L, 0x160bca22155L, 0x2d01894186L, 0x9c2d0e3584L, 0x152b6e2319aL, 0x1f818cf7cf9L, 0x0891091c61L, 0x2095b27a2eL, 0x4912957763L, 0xa027c57dcaL, 0x1d68fe7130bL, 0x47f356b0f1L, 0x176f7ebfdc8L, 0x1a8d5b6e78aL, 0xfe0d98f7e4L, 0x6c0b7d0724L, 0x1b6f83b13ddL, 0x19b38f5c9f6L, 0x1d886afd432L, 0x1f93c940d3dL, 0x1fe4fedc4aL, 0x6ecfbda2c7L, 0x19f4558a206L, 0x04d566a3b2L, 0x1071627157fL, 0x1e81a39b2edL, 0x10f0b95a60bL, 0x13db58e3f07L, 0x1c3fb8079beL, 0x1294829adc0L, 0xfe3575e14aL, 0x18a6deeb203L, 0x95fdeb8093L, 0x19d75663db0L, 0x053d5ee944L, 0x18f236bb866L, 0x1fb1b1e5b9eL, 0x8f7e086c41L, 0xa782b1ca0eL, 0x9d9b00422dL, 0xbfeacda39bL, 0x31cc3114f0L, 0xf9b87ac782L, 0x1c80c691ba0L, 0x067eee42b5L, 0xd2a07e4352L, 0x134c22aee73L, 0x13bd97ca14eL, 0x6fbd78f718L, 0xe6004f9df1L, 0x18c755c765fL, 0x10f441792a6L, 0x16359716b10L, 0x1f2dcf472c0L, 0x2c0ca01522L, 0x199f8d89498L, 0x16843f120d1L, 0x75ba11ad53L, 0x1df24c9492fL, 0x19ee5e13f4L, 0x566913ed4dL, 0x64c09ac8feL, 0x1be511a46f7L, 0xbe48447f12L, 0x1061bb192b4L, 0xb0b7a29ae1L, 0x1473b3f6f3bL, 0x16044bcee3L, 0x1c065add14bL, 0x1d068c96529L, 0x8ad61cc354L, 0x45b544bb8bL, 0x11c9716cb53L, 0x4a136e7f91L, 0x104a9a553b7L, 0x49f0175ffdL, 0x114cc1af56L, 0x103b34a0340L, 0x15ed4dce1b7L, 0x14f86fab58fL, 0x1e6f4d3a0fdL, 0x109681bb0bL, 0x14a95e81cd2L, 0x1320a7523b1L, 0x306d4289d0L, 0xd429277369L, 0x15ba89e9fcL, 0x1900679f767L, 0x185113538deL, 0x1b6b4711cdbL, 0x1f6fb6e7218L, 0x1221c845cdaL, 0x1dde29efaa7L, 0x3633d20418L, 0x1dcf1d00097L, 0xeefb1d007dL, 0x77bc5eb2c6L, 0xc1529864c6L, 0x26f10884beL, 0xb18f982d14L, 0x5d7937c815L, 0x2b89c14e89L, 0x0d80e5caf0L, 0x163101b1da7L, 0x18c3cab2c2bL, 0xeee1d80122L, 0x1ea45d5c5d9L, 0xcfdd14d6abL, 0x90a9370e7dL, 0xc8dcfb0a01L, 0x1024735b228L, 0x1c2cff31c50L, 0x1156058cd9fL, 0xdc5990a138L, 0x1e21fea4fc1L, 0x8b5937c3d2L, 0x145b4df9233L, 0x14fcb00e676L, 0x9d4170890dL, 0x6a2d2ef2a8L, 0x3e59228519L, 0x4a1ad89189L, 0x62abd7e111L, 0x19c3bac8db5L, 0x18abb6c0e0cL, 0x1d959f03efaL, 0xa3cfeb876aL, 0x1e8b8776e57L, 0x1787f5f43b1L, 0x1ec5ad4e7abL, 0xc2b05105b8L, 0x96a1b59264L, 0x12999264706L, 0x81ca4ba261L, 0x9134f20b21L, 0x179d71ff6beL, 0x1243881f926L, 0xc8f9245182L, 0xcba62d06f4L, 0x176b7b9af7L, 0x1108b6f7c63L, 0x1880a492646L, 0x1e3fee035a0L, 0x1668160bc58L, 0x2733019c7bL, 0xb9de37bb8eL, 0x12ed8ec25faL, 0x4f62a3778cL, 0x17360487610L, 0x14e33fc0639L, 0xa0a10a97f4L, 0x1763aba6b4fL, 0x1dc7a757e4aL, 0x17abc3b4ee9L, 0x1eaaea53a67L, 0x145007d5979L, 0x1dce3745071L, 0x1f1b44b5d78L, 0x3b73688573L, 0x5cd8f9cfcdL, 0x1785a66a271L, 0x8f0e17fbecL, 0xf9488a572dL, 0xe860bf02a2L, 0x1fdd86d5913L, 0x6a3eab24d9L, 0x1f45f46f9c0L, 0x1f1414a0ddL, 0x922e31a3beL, 0x106c46d05d5L, 0x79a744746fL, 0x05ffcaf33eL, 0xb44162e63dL, 0xeaf2759f8fL, 0x6a28e562bbL, 0x1746a2d11e2L, 0xedae163f0cL, 0x31890eef51L, 0x837829ad9dL, 0x82698fea60L, 0xdac5dba09fL, 0x1b83dc21e55L, 0xfdad17a096L, 0x1042bf42853L, 0x379ad27293L, 0x8ade2ea6afL, 0x2492545a51L, 0x128bcb7c74dL, 0x16f9336a77cL, 0x11c2c8353ccL, 0x110643a6460L, 0x1dd0b8d73bcL, 0x8650fa2130L, 0x18ba7c21a96L, 0x28c1735cdeL, 0x126fb5d4d02L, 0x18a939c00f2L, 0x3717f3abfaL, 0x4f797ca28bL, 0x54875377e0L, 0x1dda46e3658L, 0x1f4fef6d93dL, 0xef43b5d782L, 0x154eafbbf5fL, 0x185512e13bdL, 0x85bd765762L, 0x1638db6a40aL, 0x7070ee5bd5L, 0x18ba62098eaL, 0x1a300a93bcfL, 0x18db9ad96a9L, 0x095c21fecdL, 0x3df20e4acfL, 0x7b05394f46L, 0x72b0de0cccL, 0xf8c759ee8cL, 0xa12fe616a3L, 0x1ad5de466b8L, 0x1bd329666bL, 0xcc98e698e1L, 0x1593a5e3bc1L, 0x1b09bc8d7b7L, 0xd7d95f6064L, 0x146d56dfb6bL, 0x151ace7f0c7L, 0x5235f47104L, 0x160552f2bd9L, 0xb85d711139L, 0x1b9909e4c5eL, 0x1e9fd6383b8L, 0x13aa2a4a94L, 0x1cd28f19398L, 0x1328cd2adcbL, 0x36f95e901dL, 0x1ff1761808fL, 0x1bf5cba1d0dL, 0x152fb021b19L, 0xf9ecfc3a61L, 0xac948d2cb6L, 0x0b7e1788feL, 0x121f739dcb4L, 0x1c85a9b2558L, 0x5e91fd6423L, 0x1986779c35aL, 0x146247fa70L, 0x19160cd13b4L, 0xe990ebe27aL, 0x121ff3ee3c3L, 0x103173ff5e4L, 0x999d1faf27L, 0x1bed034cdb9L, 0x129c2237599L, 0xb73e6e84acL, 0x14fedd6c98bL, 0x32fddcf527L, 0x112f9e8b254L, 0x1c2b79f0489L, 0xc92da5c461L, 0x1eb749d5deaL, 0x146d88e7d76L, 0x12775e52da6L, 0x19c87d17e43L, 0x7c8ffc74d3L, 0x15f7e792e6L, 0x28d0ef5231L, 0x748148e4ecL, 0x9fd9a463f5L, 0x159974ab0d1L, 0x7b2e95390bL, 0x1ff14f5ac33L, 0x1f655a5054L, 0xacf593d41aL, 0x898c1402a1L, 0x93b3e0e6aeL, 0x18d45df2de5L, 0x11ee6cb87ceL, 0x10936d11081L, 0x1cae4599782L, 0x188e5a850b5L, 0xcd074f4022L, 0x1dfca5b7190L, 0xb68e62b82bL, 0x16e8dc2307bL, 0x17c57ec8ddcL, 0x2826044499L, 0x106bc22fc2cL, 0xc14f105ed4L, 0x15af4d3f42aL, 0x137e93a480aL, 0x1849474f50eL, 0x16dba230a81L, 0x1739183125L, 0x135fefc57c4L, 0xb3f2d634eaL, 0x29710ac92cL, 0x148cf641ae9L, 0x6708f24fcdL, 0xf94815f6faL, 0x121607febdaL, 0x805bb5d7ecL, 0x1c39320b045L, 0x62000cdbc8L, 0x14ac177b4a5L, 0x063a51304eL, 0x12443627fa6L, 0x1acd66a314cL, 0xf3b5bed960L, 0x1517dc78a4dL, 0x16839481f18L, 0x7aa6079abeL, 0x1f6e9c6f5e5L, 0x942c5bae28L, 0x458cd0f0a5L, 0x1432717dd98L, 0xe39ebb3ef5L, 0x1f0115ab508L, 0x1662d90cacfL, 0x4d1177e1e0L, 0x92137e93e7L, 0xbf5c0ff11bL, 0x1a81e81568dL, 0x11aaf91d931L, 0x18922c9bfbaL, 0x1d68ad74405L, 0xa78bce4d95L, 0x10edea8ed9fL, 0x2f6bdf7c6eL, 0x1460858efb8L, 0x628b39bfa1L, 0x1c3215f60abL, 0x18ea1a46e45L, 0x19bf64425eL, 0xd310f81754L, 0x1710d4c011fL, 0x18a69b611f9L, 0xdebbe1d511L, 0x2fbfefbb73L, 0x97f0e7392eL, 0xea0d6b3747L, 0xee85459226L, 0x19f66c0749fL, 0x1db94352bd4L, 0x171dd78c628L, 0xcbba32d9b0L, 0xd5e371e1d0L, 0x137c3fca430L, 0x6ad97a92e9L, 0x12f79b381efL, 0x59b998e941L, 0xb2e255ed67L, 0x13354c8c86L, 0x1aa40ef5488L, 0xb95adbcc0dL, 0x1d4897b2626L, 0x1166b9dfc1aL, 0x1784c28be7aL, 0x1015dab617L, 0x5ecb96cd36L, 0x81600554a2L, 0x1f48f1758cbL, 0x1102cad72f0L, 0x10f94a3df50L, 0xdb38400c7eL, 0x1d29e72e330L, 0x59698d378fL, 0x167078aad77L, 0x48a99ecc6aL, 0x14c574abe4bL, 0x6fe03d48c3L, 0x1baf5decb77L, 0x12fdb9e349bL, 0x103664d422fL, 0x7599779f7aL, 0x1ee922cc3aaL, 0x16276782f89L, 0x37c979c3bcL, 0xcdba2dc35fL, 0x52f84ee994L, 0x1efe6aa735fL, 0x15a1639ed91L, 0x9e3a598da6L, 0x19a86ca9a9L, 0x970dadb02bL, 0xd2d2239539L, 0x1b5a9a7d43aL, 0x1a28d711304L, 0x73027dc257L, 0x8697226ebbL, 0x91ab09256dL, 0xbe79f6ad45L, 0x1f077c5229L, 0x7854970278L, 0xd39af32496L, 0x195054ca9acL, 0x1c1a949a25fL, 0x199873924c4L, 0x1847acc8563L, 0x4acd98a710L, 0x0f04020319L, 0x14de092f710L, 0x305e1be573L, 0x15bd8fdc33aL, 0x15d07db004cL, 0xabd7e91181L, 0x8f5bd0f053L, 0xcbe19f767aL, 0x10be8ed0709L, 0x134b8d9b6aeL, 0x190e4ec260eL, 0x3bdcbca890L, 0x112372a27edL, 0x1feb58f771L, 0x1c4cfbe06dfL, 0xdee5b17d82L, 0x1871a774e8fL, 0xfd5def58a5L, 0x12ec074eb5fL, 0x6b55ac1c67L, 0xc5ffe47891L, 0x73b6ce69a7L, 0x66b0e0f585L, 0x100248623a3L, 0x16392f6f04L, 0x7d50747cb4L, 0x1e19f28f0aeL, 0x14f8084fd3bL, 0x18f1b547e66L, 0xd28e258b80L, 0x174de911918L, 0xcf50acb1ffL, 0xc8ee9466daL, 0xd633674cfaL, 0x323c586885L, 0x1285f5a641aL, 0x1f6d00cf4d0L, 0x106da5ccee7L, 0x8020beacb9L, 0x1af2bb77ef3L, 0x07a2f69285L, 0xeab509d74bL, 0x170b3474645L, 0x5a4dae3deaL, 0x2c433626d2L, 0x19d15ffd4eaL, 0x1147744815fL, 0x15ddaf434a9L, 0x9025076210L, 0x939368b89bL, 0x1859a3a07e7L, 0x159db2909c6L, 0x16d8f3a0103L, 0x1905ea325b2L, 0x19381a115aaL, 0x1f9ea104107L, 0x1e79cd536cL, 0xa9a3ac60e8L, 0x70d66cadb1L, 0xbc17a022c7L, 0x116da464f50L, 0xd83ca13b7dL, 0x9dcfec097cL, 0x1a3240bf4a1L, 0x11426b7932eL, 0x1acdf2b6bb1L, 0xc10683210dL, 0x7d7a7382beL, 0x5a6740670dL, 0x15b4c25f379L, 0xf3cb471e8bL, 0x1714233b4d7L, 0xb328dc549dL, 0x123e124ab06L, 0xc8d2af806cL, 0x19b6c8925caL, 0x64f327983dL, 0xdc5a2e66d8L, 0x1df61d3d025L, 0x70fac19125L, 0x6617ff9162L, 0x1da1d9503abL, 0x1ee6af25502L, 0x329c6d86ceL, 0x157e5f038e1L, 0xcc6dc97cacL, 0x24778a626bL, 0x138894bb342L, 0x7d6f002e55L, 0x4b9b4764ccL, 0xa0cbc5d154L, 0x12aff498e59L, 0x01653b5202L, 0x149b66cdb7aL, 0x4cffaca152L, 0x2f69b2b280L, 0xaed4bffbb2L, 0x1dcf40a92c5L, 0x1d5606cfc4dL, 0x1d288445a1dL, 0xa9a40a7a93L, 0x16c34dd7a7aL, 0xe30c44e5dcL, 0xe7596aeb7bL, 0xd8ec1e4dacL, 0x19acb07c581L, 0x1c59956a5deL, 0x5eb32fe0f7L, 0xd4f39ab374L, 0x41c0946c78L, 0x1a8ca1f2d3fL, 0x1aebd3c67fL, 0xed6dda9095L, 0x0d4eb3edb9L, 0x7819d2a6eeL, 0x45b8f998faL, 0x3c0201308aL, 0x1e0ffab3f53L, 0x1e6cc32a780L, 0x1045e550c09L, 0x83c4a6bfaaL, 0x22b798a1f7L, 0xf42f1fdb24L, 0x1bbfc9837f4L, 0xce03a8c117L, 0x66b8746ceaL, 0x534be8e3d1L, 0x37c5258685L, 0xed86dea0edL, 0x15ecb7ce911L, 0x1245834d414L, 0xc6ec052f56L, 0x9df26ab706L, 0x1e5d6eed381L, 0x675416f65fL, 0x7ee172ae2bL, 0x53bff79a11L, 0x1bfa2b53c01L, 0x1169abbdc78L, 0x1127893424aL, 0x128bd3ea4deL, 0x147e8cf6371L, 0x444d0b3b3fL, 0x5d2e9b8c8fL, 0x14ec21faf96L, 0x2a021b8364L, 0x188855bf812L, 0x168438f3dfcL, 0x1b3a7ea750dL, 0x1ff1a134379L, 0x10c8c199da7L, 0xec9a724ddbL, 0x11f6a71c4dL, 0xad5318169eL, 0x1b156466b97L, 0x1846159b5eaL, 0x6d0af1b37fL, 0xb7d5659b5fL, 0x163fadd70c5L, 0x1287c7ad5c8L, 0xf6df36dfb0L, 0x188bbbf3a19L, 0x14162619351L, 0x186af9c4e52L, 0x0958ca4268L, 0x8044bb1794L, 0x71113e2ff4L, 0x1fc66211707L, 0x1827c740954L, 0x1ff95d06cc4L, 0x1b54ff685c1L, 0x6d88de7741L, 0x1c927e3eca8L, 0x42c6d5652bL, 0x1c28d92cb19L, 0x1b5779b48d9L, 0x1344e24a9ceL, 0x31b6b8c707L, 0x11c4a8eb4e2L, 0x1995b6d9d79L, 0x1193ac8315fL, 0x17f611bc3b2L, 0x9902c85dc7L, 0x10ca1728539L, 0x09a5bcf7b6L, 0xc875bfe3b9L, 0x1c80ee1752eL, 0x0b61b1b07eL, 0x1e4f7552473L, 0x141ae812d3aL, 0x992bdf44f2L, 0x177cb8203f3L, 0x0cc54c9a54L, 0x12b5f0a47a0L, 0x117884a0232L, 0xbf7d50d7b6L, 0x4c6c3f6879L, 0x37a66b633fL, 0x10fd1a275eeL, 0x11e5790554cL, 0x15c168a72a3L, 0x13c7537eabaL, 0xca23dd9aeaL, 0x12dbb51fc2aL, 0x14ae352eed0L, 0x20e166257fL, 0x11ce40d3d1eL, 0x10f4929db1bL, 0x19fd90a2f45L, 0x4ee5bb04b0L, 0x60b378e062L, 0x1c86c08e115L, 0x0849e4e2deL, 0x1161e70e4cfL, 0x87d52000e4L, 0x1c0acc158abL, 0x136f7d2d252L, 0x158c0d6986cL, 0x1174bd33519L, 0x5a72318656L, 0xd6e9d0f11fL, 0x188b6005e76L, 0xecbb0ca621L, 0x1131eb3cde3L, 0x1de6369b749L, 0x153d9ccb5acL, 0x6022a8be13L, 0x368ec83b60L, 0x1345506440dL, 0xae9863319eL, 0xd963623257L, 0x97fe23da88L, 0x1cb23403fe1L, 0x190a0c54bc2L, 0x585f248208L, 0x1be4b974e1fL, 0x571a78ba23L, 0x113f244d483L, 0xf8780c4818L, 0xdb51a82200L, 0x16c49ec533aL, 0x1585317f190L, 0x1fc70105ed9L, 0x1ae4053905eL, 0x1dda20b1e04L, 0x14e06567fdaL, 0x1fcf73cc8f6L, 0xab374cf2e1L, 0x752720033aL, 0x4a6432e5dcL, 0x1c0f08cdd28L, 0x5eb87043f7L, 0x1ec38067d90L, 0x1fef4cf5059L, 0x1700dac4882L, 0x0cdd792496L, 0x1994ef8c66L, 0x1669a978facL, 0x93695c2811L, 0x8c84651653L, 0x1305144f59eL, 0x1e5597b1863L, 0x154d2615543L, 0x1e5a8c08afcL, 0x841f1b18ecL, 0x1476b7e29a0L, 0x10731c052f3L, 0x8744107d0dL, 0xc61901934dL, 0xec347b7b88L, 0xe7476d701eL, 0x06e867aafbL, 0xe1d03044bbL, 0x658319e530L, 0x14336373a0eL, 0x16cb93a933eL, 0x1b8b6d95bb4L, 0x04a5413171L, 0x10ff862197L, 0x1115f3202f1L, 0x1d6f7ed1430L, 0x1b373d7ff0fL, 0x25cfa73de1L, 0xcc6b38943aL, 0x759f924c6cL, 0x14862200a2cL, 0x1b74c7a4cb4L, 0x12d44b5851bL, 0xca97f5aeb9L, 0x4d36701f59L, 0x1de88f2493cL, 0x420abaa0f6L, 0xd892babdd5L, 0x62fe9b8b99L, 0x6a1c54d76eL, 0xb87dde2e3bL, 0xc77657afe3L, 0x6b72f09030L, 0x184b68bbaeaL, 0x22a6cd479eL, 0x166f0c5ba7L, 0x1809f47bad3L, 0x18ed0cf68afL, 0x1ae1368afdaL, 0xca2d646634L, 0x1320f49e286L, 0xd56c0385bdL, 0x6b6f80ffc8L, 0xb0615b2264L, 0x125287f0185L, 0x110b2bee8fL, 0x1e9004a8e70L, 0x15dde15e068L, 0x10438693ad9L, 0x15baa26fb1eL, 0x183bfc66070L, 0x804a41b38fL, 0x5dbd4a1a67L, 0xb10be90245L, 0x50b250494fL, 0x1dac323cc2L, 0x175a189df75L, 0x12ddf98fe04L, 0x10862cc7c48L, 0x1dc90b7cd4L, 0x11dbf851ad7L, 0x1a87ae5dc11L, 0x17f7fa9e215L, 0x13038ead8feL, 0x1181bd7be69L, 0x119086a04d8L, 0x1589d569b98L, 0x1e9b00424f1L, 0x80ff1896e9L, 0x90d4c22245L, 0x1eaf9672f6L, 0x4afcdf31faL, 0x145d412a4c3L, 0xab19785bb1L, 0x1d96d082bbeL, 0x14286dce6ecL, 0x160fd92f8fbL, 0x12fdcb8b2afL, 0x1a01a3425daL, 0x133162849bfL, 0x17f312a577bL, 0xa28b92bb72L, 0x18e5fbd6372L, 0x1df71ceaceeL, 0x12c5bdf9515L, 0xe6c1acce21L, 0x9d25699cd2L, 0x15270b91c81L, 0x126e0bb0707L, 0xfdfae613f7L, 0x16e8679d842L, 0x1d2c9b489adL, 0x1abd33e45ccL, 0x192f2c15d5dL, 0x1713ce8276cL, 0x10e56516b04L, 0x13739a4e4b7L, 0x76c27d6558L, 0x1eee4c41ee2L, 0x64d3c6c09bL, 0x15d2944dbe0L, 0xc61d6ba698L, 0x180dffc6541L, 0x15061fb4932L, 0xdf6e885666L, 0x127eec246c8L, 0x19b51fd70c4L, 0x1187e4df717L, 0x6a8b0a8f1dL, 0x11942390170L, 0xa421965912L, 0x1f726d51351L, 0x317c4daa03L, 0x1acdc1ece78L, 0x3fd243f3ebL, 0xfdc16c4efbL, 0x2f12371b10L, 0x39b6e20f1cL, 0x169ab733a9eL, 0xfb398f0a72L, 0x2761cbddc4L, 0xd6a06bbcceL, 0x56f4927d58L, 0xc5a4372537L, 0x1b90381e8d6L, 0x91b9fae2d8L, 0x16ee910633bL, 0xa7bc7dd016L, 0xe725ab716aL, 0x18227cf3c37L, 0xdba6f91ce3L, 0x1fedfb8bf3eL, 0x15de02922d1L, 0xd11529aaa3L, 0x1a162d5f7f1L, 0x4b0b4d9d3eL, 0x6f50397572L, 0x1348ebcfc2eL, 0x9df43157d4L, 0x1999827f76aL, 0x1467f2570f3L, 0x1eba5dff8c1L, 0x10ee96b1e22L, 0x107be5eddbeL, 0x1411df497c3L, 0xd226a166c0L, 0xf3d092e815L, 0x58e2ed63ceL, 0x13bd7ba8df6L, 0x1298e4f35ceL, 0x11be9845c0dL, 0xb53afc8ffaL, 0x67af688e82L, 0x10a41cd33d7L, 0xf6838baeabL, 0x0777ac0858L, 0x1dfcd3f233bL, 0x34944e7100L, 0x12487a3b270L, 0xec12b9190dL, 0x1bbc01a91c7L, 0x656b8c243bL, 0x4dbb62b088L, 0x13ab915c3faL, 0x1f8a3d62167L, 0x009a46896aL, 0xfb5f4d2feaL, 0x1116bc7e342L, 0x183e9fd5a14L, 0x1d0c98a1c5eL, 0x15d459676d3L, 0xf760f6f9a3L, 0x12c66e40456L, 0x173ddc771b1L, 0x07db0a1578L, 0x1f3ce6f5029L, 0x77d9f5679bL, 0x1ac5f85b64L, 0x04c672cd5dL, 0x15680655ee8L, 0x186876a1255L, 0x774469842eL, 0x13271af9a24L, 0x6e89c9fb2cL, 0x6c1d9e2be1L, 0xf0741acf5aL, 0x2aa8d88feeL, 0x038b16ed82L, 0xe9cba39dd7L, 0x912e6005cbL, 0x1251d6608a9L, 0xe0b6ff59fbL, 0xe08ea95b44L, 0x14573ade1a2L, 0x15b7c8a4880L, 0x30578d9c9aL, 0x1fd9016e391L, 0xa0f6219300L, 0xd6556f9ac1L, 0x1c1012de94L, 0xb971893af5L, 0x11ca283b57bL, 0x10c64cb9e05L, 0x1aa714b75b4L, 0x14aca141713L, 0x125c7fabffdL, 0xa981632be8L, 0x113c56a7e7aL, 0xd2ba1957efL, 0x160d918b563L, 0xfb8ce18705L, 0x7127d3be2cL, 0x12a325812acL, 0xa0ae4e4033L, 0x7a50e36769L, 0x0c0f50d2c7L, 0x0890ba241cL, 0x10b3a091b74L, 0x1dfa797966L, 0x1952caa9badL, 0x9d825284d7L, 0x4ba9437737L, 0x1f33933c933L, 0x6d53c810e2L, 0xe4a1f020fbL, 0x152a41fc39dL, 0x1e6f1b3bd37L, 0x91ea70722fL, 0x28924a2a6dL, 0x1ec4fbfa9abL, 0xa989d49062L, 0x79387b2a25L, 0x54b2e53b73L, 0x14dc3868cf9L, 0x14b9d290525L, 0xb777ff6c35L, 0x9774746651L, 0x14c55cb6390L, 0x571a4688bfL, 0x312aa0996aL, 0x1532efa1a5cL, 0xdfec4adedfL, 0x9681870c1aL, 0xc30efd0321L, 0x1e872eec40L, 0x10aee5189eL, 0x1b54c11e3b0L, 0x1054076b18bL, 0x12009bab10fL, 0x1f5de648026L, 0x1fec2d089f6L, 0x1ae79a3d351L, 0x16055846033L, 0x14a18cf43cdL, 0x2b4868b059L, 0xf39d118addL, 0x184fa8a563bL, 0x5dcd75adefL, 0x1f867bca4caL, 0x722f8230e0L, 0x1c7739a0b92L, 0x14d27afcac6L, 0x1ff4483a337L, 0x1ee3e7ec65eL, 0x15bdf9cf572L, 0xac55b183d8L, 0x1bd7ba5eb7eL, 0x13d6f28d36dL, 0x94483a59c7L, 0x1971a6811fcL, 0x1d01f6dc8e5L, 0x1d7041a8164L, 0xcd4bb66307L, 0x3cc8bae5d2L, 0x40a28f0a0eL, 0x28ff942508L, 0x10f7db14df0L, 0x970a05aa25L, 0x4a714b291eL, 0xc701e4e2e9L, 0x0c3311c809L, 0x85c5af52ebL, 0xd2a0ddcc3bL, 0x1b86f410788L, 0x1ede3484ca6L, 0x4074091b8aL, 0xcdace8c340L, 0x964a817ec7L, 0x53c4b1e08aL, 0x71f3cfaffdL, 0x1c847b0f581L, 0x1f95bfc003bL, 0x1c86666096L, 0x448e6a5cafL, 0x17d9562fe30L, 0x14b11e2c939L, 0x146ba94fe60L, 0x13917b4bc7cL, 0x1bfab5951e7L, 0x19279b20f95L, 0x216bd36a1bL, 0x17888e39bb5L, 0xae80792a03L, 0x8298ab4acbL, 0x10dfed49850L, 0xcb166c8a85L, 0x101beba4048L, 0x855cff4fc0L, 0x1849168c1c5L, 0x10a38f62987L, 0x49cf1f189bL, 0x16a2876af49L, 0x87fa6e2a56L, 0x62c7b015c2L, 0xd5c29bc4a1L, 0x62091756edL, 0x518e01968dL, 0x3d09d83c3aL, 0x54f111c2e2L, 0x1555bb741cdL, 0x9dbccd3073L, 0x1ec92ece825L, 0x0112998bc8L, 0xe02379d7c8L, 0x149f696fd0fL, 0x1b7137d7768L, 0x1a3b030519cL, 0x1e1d806bfcdL, 0x0bc65b06e8L, 0x1983059408aL, 0x1e9fe1feca9L, 0x132c0a95aaL, 0xa6dc5119e7L, 0xfd58b2db10L, 0x137e20c98e5L, 0x968688531cL, 0xa81dc892a8L, 0xf861cd9997L, 0x1b0d2b12efbL, 0x00bea34e27L, 0xdb665c24f9L, 0xe90e722940L, 0x106d989a38L, 0x2e84aac68eL, 0xf3e4a70319L, 0x1d9d002369bL, 0x1c31c31105L, 0x91514c5856L, 0x1c49b1c053bL, 0x1ebef82c4a5L, 0x1ec86920675L, 0x1253eb1b8cfL, 0x19c293afdd8L, 0x1e6a30fc496L, 0x1cf75469e1L, 0x1216b1b956cL, 0x6dc53cf47cL, 0x16b338cb908L, 0x7bc89831bbL, 0x12bfceaee52L, 0x602827afa6L, 0x129bef4e086L, 0x19ade8a837bL, 0x8f365a39dcL, 0x13331a3ed5dL, 0x167bf567e12L, 0x1817eb5403dL, 0x116a0ac445bL, 0x151f5a1ae96L, 0x355fbafed3L, 0x1721a856f18L, 0x398c5fb690L, 0x18fde252209L, 0x9bc1effd8dL, 0x15e058368cbL, 0x1ef19f8672dL, 0xefeb28bcb5L, 0x8597fe8243L, 0x1e3558b7241L, 0x1f06d2b5a4dL, 0x6753166ca7L, 0x19d05252f87L, 0x7ece8719c7L, 0xabada7be10L, 0x3b7bae0915L, 0xb920dbfa1eL, 0x77c3d750efL, 0xc8a77b91e5L, 0x13c12511766L, 0x1bd655e970dL, 0xd5f0a10e67L, 0x5c151f0386L, 0xf36c123216L, 0x733590bd56L, 0x134800baf0L, 0x166cf1de51fL, 0x117dd06e881L, 0x129a0921efbL, 0xa6ff0ca5c4L, 0x8ea200b050L, 0x34f9387b94L, 0x1d3723ad2deL, 0x18e5af2b62eL, 0x10bd979c6dfL, 0x14d339607a4L, 0x1b88544514aL, 0x3a4450d2d8L, 0x1a61117a18fL, 0x1e21725e539L, 0x123cf7364fdL, 0x179908b5b01L, 0x69ec91a349L, 0x945679ec02L, 0xe6a4ca1b53L, 0x7e2c612da0L, 0x1f568f32763L, 0x1b564f98a0fL, 0x20e11f4d89L, 0x90c3ea1433L, 0x14c7e71acd3L, 0xdc4e4b061fL, 0x1c813886671L, 0x998741f58bL, 0xfe30e80a8fL, 0x607de6a503L, 0x1484657259dL, 0xe53c335255L, 0x174d9bd2dc8L, 0x7d39cfa317L, 0x1c0992c6850L, 0x112351c0a60L, 0x1e0d5e6cd44L, 0x667998400cL, 0x42dfaef259L, 0x19abbd3ed08L, 0x14ad9c7ab72L, 0x56389ff426L, 0x19427c1236cL, 0x1a4063a9d61L, 0xaf87f97b4dL, 0x1666612b513L, 0x1f23ac539e4L, 0x1e873a1cf84L, 0x1701f1aeddcL, 0x18b22a98565L, 0x1ddc760ab43L, 0x22da169d55L, 0xf1416893deL, 0xee14c0e6dbL, 0x19252aae1f5L, 0x0b4fb6141dL, 0xc2b99da72cL, 0x19ec587f23aL, 0x1f44dc5cd77L, 0x101573c5f0cL, 0xc8590ac48fL, 0x1f1d4b1d98dL, 0x12ae39c0c1eL, 0x16e46996bb3L, 0xd907071ae1L, 0xee89247a5bL, 0x12753bfdbceL, 0x7906c2f180L, 0x6632db9a04L, 0x6dd60d443fL, 0x6b859327f2L, 0x18f08bb0ad5L, 0x100dd9d760aL, 0x1e8c644d0dL, 0x1e8edb740dcL, 0x16ba7ffa32eL, 0xbfbda5d84cL, 0x17fdf137ad8L, 0x777ffe01dbL, 0x13b9a93d0a6L, 0x32bde748a4L, 0x104f87c4ba8L, 0x1102e5438a0L, 0x1790599f8b8L, 0x6e0e97a55cL, 0x980d898e6bL, 0x14035825c86L, 0x199ded7a4bfL, 0x138ab0050f4L, 0xf8c1940ddaL, 0x129ad4d2a65L, 0x76a9aca541L, 0x1332c5d323cL, 0x1dba5113a26L, 0x1c66d9f5293L, 0x17e232d0d9aL, 0x9976915862L, 0x1913b2a7244L, 0xb2ba534e99L, 0x160d1bf0cf7L, 0x0eb9922d30L, 0x2e3f788035L, 0x1d158a6dfbeL, 0x14e9413f1feL, 0x132d8c19753L, 0x14b4f73c0c3L, 0x1f33b28cfdL, 0x72a8fad428L, 0x1514364455cL, 0x2d98ab517fL, 0x167cedc2d26L, 0x1bb3c039f02L, 0x144f9f06518L, 0x86d324dd1cL, 0x12c4eb26f57L, 0x78ea843219L, 0x6a55f7e6b6L, 0x6d7b34c6e0L, 0x1016cfeb2ecL, 0x4215676871L, 0x156b12b4c31L, 0x586fdbe5d9L, 0x30212d8b7bL, 0x1cc7382e8cdL, 0x6ca5a2d1ecL, 0x875c7a96f2L, 0x1710b90c031L, 0x10d1d8c47aL, 0x1bf01e51bb9L, 0xc1793e8778L, 0x1b326c2d7e2L, 0xc5310a5aabL, 0x11cd7b3c8e5L, 0x18d5912ebaaL, 0x17450d723c4L, 0xab2fa34dcdL, 0x12c7246a7bcL, 0x1b365296a34L, 0xc47f954743L, 0x50467ba354L, 0x2cc0b816e1L, 0x17598c4f17dL, 0x1af4283647bL, 0x5a5d5379ecL, 0x1aaecddc00dL, 0x1325e99894fL, 0x3935af6226L, 0x18450e1eebeL, 0x9adfe3a3d0L, 0x79383c9291L, 0x2212102d63L, 0x153d2be7427L, 0xfb53f1bb55L, 0x918bed2982L, 0x10f53f0d799L, 0x526ff4d1b3L, 0xbc90635acdL, 0x1453b55ba1dL, 0x1079d69bec4L, 0x1af3934bd83L, 0xb29697fc3fL, 0x108533de8ddL, 0x12968f67594L, 0x11cbe9cb3edL, 0x0bac4e20c3L, 0x134251aba54L, 0x14eaaa20df5L, 0x1528aec9718L, 0x170983cc1ecL, 0x2f097e68c8L, 0x5f746b9d5cL, 0x1ca56b310f3L, 0x3972530948L, 0x9ba80f3bceL, 0x16c5f86f30dL, 0x119664abd83L, 0x16fdda25a23L, 0x17631d1a1d3L, 0x3d72d2b20dL, 0x11f52f5697bL, 0x1d6b6d864fL, 0x43d6422f0aL, 0x16ef1aa2e0cL, 0xe1a3790b11L, 0xf1667a531dL, 0x11cc7bbbcdaL, 0x1ace1b03f19L, 0x18bd83b1d52L, 0x8a5de68db4L, 0x18fbf08cfefL, 0x82019639ccL, 0xab6b9a8d3bL, 0x1fc4a838fbaL, 0x104f0d67db1L, 0x1e4bd144895L, 0x10493faac76L, 0x6f1ac45d00L, 0x1b845ac503L, 0x1a071baaaefL, 0x17ce5822109L, 0x1a7b9992debL, 0x1641ad2afd1L, 0x1983f74b6eeL, 0x11dd4491184L, 0x1597809c70cL, 0x1c9ee207a02L, 0x1fb967dbcceL, 0x13dd5d0740L, 0x1f04a7cf90aL, 0xbda526f2c0L, 0x0a290afad5L, 0x1f74ef5e0edL, 0xad155bc8deL, 0x08a74e0d64L, 0x1e26d6d2095L, 0x1efe9d3f3feL, 0xb7bb790080L, 0xe83eb7940bL, 0x195a6721deL, 0x1697162ecc6L, 0x1a822424eccL, 0xbb9409ef14L, 0x88dc8af7deL, 0x1a109fbdf8L, 0x1263a6224e1L, 0x19762451a46L, 0x123f8087a5dL, 0x1ee61da2ff8L, 0x1050f8b67b3L, 0x5bd05e0ad3L, 0x17f3054510bL, 0x1f0a65cbe49L, 0xc38f39ecfbL, 0x1b186adf1caL, 0x03c9d6cb25L, 0xb0d33343b8L, 0x8cb15b5077L, 0x83960895ddL, 0xa4f544f26cL, 0x14637fba5b5L, 0xc8a7c5184dL, 0x109ef503b91L, 0x110cc27f58cL, 0x1dd15e9f124L, 0x1eddb2ca0d9L, 0xaafbfcea5bL, 0x3f14f93014L, 0x1c8249b99d9L, 0x7c3667f5b3L, 0x1a62b640f70L, 0x1eec6a22d2aL, 0x855be93f97L, 0xc7af091027L, 0x10a7ffe2790L, 0x1042e09ea4cL, 0x76db25a8e1L, 0x1654d706d3fL, 0x260b3a5e33L, 0x88f9419e9eL, 0x1d68917df54L, 0x1188549820dL, 0x158d48169b9L, 0x19e93fcdd73L, 0x16b91a47690L, 0x1fba468bd65L, 0xbb64a6d60fL, 0x157432e4097L, 0x88a4f70f06L, 0xf091d83cf0L, 0x1c4a6fbc192L, 0xada88c3e7dL, 0xe531e141b5L, 0x1237b66171cL, 0x12749c7c2f4L, 0xe2cee269f9L, 0x260340689fL, 0x19500504a28L, 0x14432099794L, 0x47cbdd04d3L, 0x1af023fdbeL, 0x1eee99e354eL, 0x12649e3affL, 0x1a7f7a49cbfL, 0xe43793e465L, 0x6209ca0402L, 0x1eadfe92cffL, 0x3dacced0bcL, 0x97a15758c0L, 0x1fcd58aeaaeL, 0xff774c923fL, 0x7a5654482cL, 0x1b492028846L, 0x15c12bf403fL, 0x1e7575219b9L, 0x342bb31b5cL, 0x1a8052db35eL, 0xe8274ad0dbL, 0x0f1a937c8aL, 0x94b5e48ed7L, 0x352cb6ab16L, 0x15cff6a6f12L, 0x1ee40155a64L };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[2115];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 2115);
		return codes;
	}

	public TagStandard41h12()
	{
		super(ImageLayout.Factory.createFromString("Standard", "ddddddddddbbbbbbbddbwwwwwbddbwdddwbddbwdddwbddbwdddwbddbwwwwwbddbbbbbbbdddddddddd"), 12, constructCodes());
	}
}

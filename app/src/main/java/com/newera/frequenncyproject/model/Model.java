package com.newera.frequenncyproject.model;

import com.google.gson.Gson;

import java.util.List;

public class Model {
    /**
     * data : [{"id":1,"name":"Bitcoin","symbol":"BTC","website_slug":"bitcoin","rank":1,"circulating_supply":1.7289837E7,"total_supply":1.7289837E7,"max_supply":2.1E7,"quotes":{"USD":{"price":6547.02640905,"volume_24h":4.41719820096398E9,"market_cap":1.13197019447E11,"percent_change_1h":0.06,"percent_change_24h":2.12,"percent_change_7d":2.9},"INR":{"price":474526.9224826845,"volume_24h":3.201574787298952E11,"market_cap":8.204493141837E12,"percent_change_1h":0.06,"percent_change_24h":2.12,"percent_change_7d":2.9}},"last_updated":1537984893},{"id":2,"name":"Litecoin","symbol":"LTC","website_slug":"litecoin","rank":7,"circulating_supply":5.8464152E7,"total_supply":5.8464152E7,"max_supply":8.4E7,"quotes":{"USD":{"price":59.1054968789,"volume_24h":3.05393790600533E8,"market_cap":3.455552761E9,"percent_change_1h":0.41,"percent_change_24h":5.36,"percent_change_7d":10.06},"INR":{"price":4283.9524057799,"volume_24h":2.213486956439823E10,"market_cap":2.50457645129E11,"percent_change_1h":0.41,"percent_change_24h":5.36,"percent_change_7d":10.06}},"last_updated":1537984937},{"id":3,"name":"Namecoin","symbol":"NMC","website_slug":"namecoin","rank":219,"circulating_supply":1.47364E7,"total_supply":1.47364E7,"max_supply":null,"quotes":{"USD":{"price":1.2488658488,"volume_24h":54943.5059192272,"market_cap":1.8403787E7,"percent_change_1h":15.6,"percent_change_24h":3.27,"percent_change_7d":-27.06},"INR":{"price":90.5175007434,"volume_24h":3982292.28741468,"market_cap":1.333902098E9,"percent_change_1h":15.6,"percent_change_24h":3.27,"percent_change_7d":-27.06}},"last_updated":1537984921},{"id":4,"name":"Terracoin","symbol":"TRC","website_slug":"terracoin","rank":666,"circulating_supply":2.2935396E7,"total_supply":2.2935396E7,"max_supply":4.2E7,"quotes":{"USD":{"price":0.1074209795,"volume_24h":6418.7681036451,"market_cap":2463743,"percent_change_1h":0.11,"percent_change_24h":-16.82,"percent_change_7d":14.02},"INR":{"price":7.7858471369,"volume_24h":465230.7909041557,"market_cap":1.78571491E8,"percent_change_1h":0.11,"percent_change_24h":-16.82,"percent_change_7d":14.02}},"last_updated":1537984924},{"id":5,"name":"Peercoin","symbol":"PPC","website_slug":"peercoin","rank":163,"circulating_supply":2.4974073E7,"total_supply":2.4974073E7,"max_supply":null,"quotes":{"USD":{"price":1.0669435915,"volume_24h":237644.169261771,"market_cap":2.6645927E7,"percent_change_1h":-0.64,"percent_change_24h":-0.06,"percent_change_7d":4},"INR":{"price":77.3318186485,"volume_24h":1.7224393066425025E7,"market_cap":1.931290489E9,"percent_change_1h":-0.64,"percent_change_24h":-0.06,"percent_change_7d":4}},"last_updated":1537984924},{"id":6,"name":"Novacoin","symbol":"NVC","website_slug":"novacoin","rank":389,"circulating_supply":2191669,"total_supply":2191669,"max_supply":null,"quotes":{"USD":{"price":3.4523111376,"volume_24h":5289.6764288799,"market_cap":7566322,"percent_change_1h":0.34,"percent_change_24h":8.19,"percent_change_7d":31.44},"INR":{"price":250.2226930584,"volume_24h":383394.4939119025,"market_cap":5.48405207E8,"percent_change_1h":0.34,"percent_change_24h":8.19,"percent_change_7d":31.44}},"last_updated":1537984924},{"id":8,"name":"Feathercoin","symbol":"FTC","website_slug":"feathercoin","rank":334,"circulating_supply":2.1306404E8,"total_supply":2.1306404E8,"max_supply":3.36E8,"quotes":{"USD":{"price":0.0458440807,"volume_24h":28755.8700484538,"market_cap":9767725,"percent_change_1h":-0.36,"percent_change_24h":0.04,"percent_change_7d":-6.91},"INR":{"price":3.3227681072,"volume_24h":2084218.645970727,"market_cap":7.07962397E8,"percent_change_1h":-0.36,"percent_change_24h":0.04,"percent_change_7d":-6.91}},"last_updated":1537984924},{"id":9,"name":"Mincoin","symbol":"MNC","website_slug":"mincoin","rank":1398,"circulating_supply":4782487,"total_supply":4782487,"max_supply":null,"quotes":{"USD":{"price":0.0226463311,"volume_24h":91.3110546861,"market_cap":108306,"percent_change_1h":0.37,"percent_change_24h":-7.18,"percent_change_7d":2.53},"INR":{"price":1.6414007129,"volume_24h":6618.2036029284,"market_cap":7849977,"percent_change_1h":0.37,"percent_change_24h":-7.18,"percent_change_7d":2.53}},"last_updated":1537984924},{"id":10,"name":"Freicoin","symbol":"FRC","website_slug":"freicoin","rank":1353,"circulating_supply":3.1477979E7,"total_supply":1.0E8,"max_supply":null,"quotes":{"USD":{"price":0.0049636103,"volume_24h":null,"market_cap":156244,"percent_change_1h":null,"percent_change_24h":2.25,"percent_change_7d":2.4},"INR":{"price":0.3597612948,"volume_24h":null,"market_cap":1.1324559E7,"percent_change_1h":null,"percent_change_24h":2.25,"percent_change_7d":2.4}},"last_updated":1537977844},{"id":13,"name":"Ixcoin","symbol":"IXC","website_slug":"ixcoin","rank":1212,"circulating_supply":2.1022608E7,"total_supply":2.1022608E7,"max_supply":null,"quotes":{"USD":{"price":0.0316407117,"volume_24h":363.6040819637,"market_cap":665170,"percent_change_1h":0.08,"percent_change_24h":-4.34,"percent_change_7d":-7.31},"INR":{"price":2.2933112831,"volume_24h":26353.9376865625,"market_cap":4.8211384E7,"percent_change_1h":0.08,"percent_change_24h":-4.34,"percent_change_7d":-7.31}},"last_updated":1537984925}]
     * metadata : {"timestamp":1537984355,"num_cryptocurrencies":2003,"error":null}
     */

    private MetadataBean metadata;
    private List<DataBean> data;

    public static Model objectFromData(String str) {

        return new Gson().fromJson(str, Model.class);
    }

    public MetadataBean getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataBean metadata) {
        this.metadata = metadata;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class MetadataBean {
        /**
         * timestamp : 1537984355
         * num_cryptocurrencies : 2003
         * error : null
         */

        private int timestamp;
        private int num_cryptocurrencies;
        private Object error;

        public static MetadataBean objectFromData(String str) {

            return new Gson().fromJson(str, MetadataBean.class);
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public int getNum_cryptocurrencies() {
            return num_cryptocurrencies;
        }

        public void setNum_cryptocurrencies(int num_cryptocurrencies) {
            this.num_cryptocurrencies = num_cryptocurrencies;
        }

        public Object getError() {
            return error;
        }

        public void setError(Object error) {
            this.error = error;
        }
    }

    public static class DataBean {
        /**
         * id : 1
         * name : Bitcoin
         * symbol : BTC
         * website_slug : bitcoin
         * rank : 1
         * circulating_supply : 1.7289837E7
         * total_supply : 1.7289837E7
         * max_supply : 2.1E7
         * quotes : {"USD":{"price":6547.02640905,"volume_24h":4.41719820096398E9,"market_cap":1.13197019447E11,"percent_change_1h":0.06,"percent_change_24h":2.12,"percent_change_7d":2.9},"INR":{"price":474526.9224826845,"volume_24h":3.201574787298952E11,"market_cap":8.204493141837E12,"percent_change_1h":0.06,"percent_change_24h":2.12,"percent_change_7d":2.9}}
         * last_updated : 1537984893
         */

        private int id;
        private String name;
        private String symbol;
        private String website_slug;
        private int rank;
        private double circulating_supply;
        private double total_supply;
        private double max_supply;
        private QuotesBean quotes;
        private int last_updated;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getWebsite_slug() {
            return website_slug;
        }

        public void setWebsite_slug(String website_slug) {
            this.website_slug = website_slug;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public double getCirculating_supply() {
            return circulating_supply;
        }

        public void setCirculating_supply(double circulating_supply) {
            this.circulating_supply = circulating_supply;
        }

        public double getTotal_supply() {
            return total_supply;
        }

        public void setTotal_supply(double total_supply) {
            this.total_supply = total_supply;
        }

        public double getMax_supply() {
            return max_supply;
        }

        public void setMax_supply(double max_supply) {
            this.max_supply = max_supply;
        }

        public QuotesBean getQuotes() {
            return quotes;
        }

        public void setQuotes(QuotesBean quotes) {
            this.quotes = quotes;
        }

        public int getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(int last_updated) {
            this.last_updated = last_updated;
        }

        public static class QuotesBean {
            /**
             * USD : {"price":6547.02640905,"volume_24h":4.41719820096398E9,"market_cap":1.13197019447E11,"percent_change_1h":0.06,"percent_change_24h":2.12,"percent_change_7d":2.9}
             * INR : {"price":474526.9224826845,"volume_24h":3.201574787298952E11,"market_cap":8.204493141837E12,"percent_change_1h":0.06,"percent_change_24h":2.12,"percent_change_7d":2.9}
             */

            private USDBean USD;
            private INRBean INR;

            public static QuotesBean objectFromData(String str) {

                return new Gson().fromJson(str, QuotesBean.class);
            }

            public USDBean getUSD() {
                return USD;
            }

            public void setUSD(USDBean USD) {
                this.USD = USD;
            }

            public INRBean getINR() {
                return INR;
            }

            public void setINR(INRBean INR) {
                this.INR = INR;
            }

            public static class USDBean {
                /**
                 * price : 6547.02640905
                 * volume_24h : 4.41719820096398E9
                 * market_cap : 1.13197019447E11
                 * percent_change_1h : 0.06
                 * percent_change_24h : 2.12
                 * percent_change_7d : 2.9
                 */

                private double price;
                private double volume_24h;
                private double market_cap;
                private double percent_change_1h;
                private double percent_change_24h;
                private double percent_change_7d;

                public static USDBean objectFromData(String str) {

                    return new Gson().fromJson(str, USDBean.class);
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public double getVolume_24h() {
                    return volume_24h;
                }

                public void setVolume_24h(double volume_24h) {
                    this.volume_24h = volume_24h;
                }

                public double getMarket_cap() {
                    return market_cap;
                }

                public void setMarket_cap(double market_cap) {
                    this.market_cap = market_cap;
                }

                public double getPercent_change_1h() {
                    return percent_change_1h;
                }

                public void setPercent_change_1h(double percent_change_1h) {
                    this.percent_change_1h = percent_change_1h;
                }

                public double getPercent_change_24h() {
                    return percent_change_24h;
                }

                public void setPercent_change_24h(double percent_change_24h) {
                    this.percent_change_24h = percent_change_24h;
                }

                public double getPercent_change_7d() {
                    return percent_change_7d;
                }

                public void setPercent_change_7d(double percent_change_7d) {
                    this.percent_change_7d = percent_change_7d;
                }
            }

            public static class INRBean {
                /**
                 * price : 474526.9224826845
                 * volume_24h : 3.201574787298952E11
                 * market_cap : 8.204493141837E12
                 * percent_change_1h : 0.06
                 * percent_change_24h : 2.12
                 * percent_change_7d : 2.9
                 */

                private double price;
                private double volume_24h;
                private double market_cap;
                private double percent_change_1h;
                private double percent_change_24h;
                private double percent_change_7d;

                public static INRBean objectFromData(String str) {

                    return new Gson().fromJson(str, INRBean.class);
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public double getVolume_24h() {
                    return volume_24h;
                }

                public void setVolume_24h(double volume_24h) {
                    this.volume_24h = volume_24h;
                }

                public double getMarket_cap() {
                    return market_cap;
                }

                public void setMarket_cap(double market_cap) {
                    this.market_cap = market_cap;
                }

                public double getPercent_change_1h() {
                    return percent_change_1h;
                }

                public void setPercent_change_1h(double percent_change_1h) {
                    this.percent_change_1h = percent_change_1h;
                }

                public double getPercent_change_24h() {
                    return percent_change_24h;
                }

                public void setPercent_change_24h(double percent_change_24h) {
                    this.percent_change_24h = percent_change_24h;
                }

                public double getPercent_change_7d() {
                    return percent_change_7d;
                }

                public void setPercent_change_7d(double percent_change_7d) {
                    this.percent_change_7d = percent_change_7d;
                }
            }
        }
    }
}
